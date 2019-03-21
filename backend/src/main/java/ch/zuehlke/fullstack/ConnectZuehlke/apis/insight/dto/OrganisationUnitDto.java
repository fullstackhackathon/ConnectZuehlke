package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.OrganisationUnit;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

@JsonIgnoreProperties
public class OrganisationUnitDto {
    @JsonProperty("Id")
    private String id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Type")
    private int type;
    @JsonProperty("Children")
    private List<OrganisationUnitDto> children;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public List<OrganisationUnitDto> getChildren() {
        return children;
    }

    public OrganisationUnit toOrganisationUnit() {
        return new OrganisationUnit(
                getId(),
                getName(),
                getType(),
                getChildren().stream()
                        .map(OrganisationUnitDto::toOrganisationUnit)
                        .collect(Collectors.toList())
        );
    }
}
