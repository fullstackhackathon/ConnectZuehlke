package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.OrganisationUnitDto;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.OrganisationUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpMethod.GET;

@Service
@Profile({"prod", "staging"})
public class InsightOrganisationUnitServiceRemote implements InsightOrganisationUnitService {
    private final RestTemplate insightRestTemplate;

    @Autowired
    public InsightOrganisationUnitServiceRemote(RestTemplate insightRestTemplate) {
        this.insightRestTemplate = insightRestTemplate;
    }

    @Override
    public List<OrganisationUnit> getTeams() {
        List<OrganisationUnit> units = getOrganisationUnits();
        return units.stream()
                .filter(OrganisationUnit::isTeam)
                .collect(toList());
    }

    @Override
    public List<OrganisationUnit> getFocusGroups() {
        List<OrganisationUnit> list = getOrganisationUnits();
        return list.stream()
                .filter(OrganisationUnit::isFocusGroup)
                .collect(toList());
    }

    @Override
    public List<OrganisationUnit> getTopicTeams() {
        List<OrganisationUnit> list = getOrganisationUnits();
        return list.stream()
                .filter(OrganisationUnit::isTopicTeam)
                .collect(toList());
    }

    @Override
    public List<OrganisationUnit> getOrganisationStructures() {
        List<OrganisationUnit> list = getOrganisationUnits();
        return list.stream()
                .filter(OrganisationUnit::isFocusGroup)
                .collect(toList());
    }

    private List<OrganisationUnit> getOrganisationUnits() {
        ResponseEntity<List<OrganisationUnitDto>> response = this.insightRestTemplate
                .exchange("/organisationunits", GET, null, new ParameterizedTypeReference<List<OrganisationUnitDto>>() {
                });

        return response.getBody().stream()
                .flatMap(flatChildren())
                .map(OrganisationUnitDto::toOrganisationUnit)
                .collect(toList());
    }

    private Function<OrganisationUnitDto, Stream<? extends OrganisationUnitDto>> flatChildren() {
        return organisationUnitDto -> Stream.concat(Stream.of(organisationUnitDto), organisationUnitDto.getChildren().stream().flatMap(flatChildren()));
    }
}
