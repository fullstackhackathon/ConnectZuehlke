package ch.zuehlke.fullstack.ConnectZuehlke.rest;


import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightOrganisationUnitService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.OrganisationUnit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganisationUnitRestController {
    private final InsightOrganisationUnitService organisationUnitService;

    public OrganisationUnitRestController(InsightOrganisationUnitService organisationUnitService) {
        this.organisationUnitService = organisationUnitService;
    }

    @GetMapping("/api/teams")
    public List<OrganisationUnit> getTeams() {
        return organisationUnitService.getTeams();
    }

    @GetMapping("/api/focusGroups")
    public List<OrganisationUnit> getFocusGroups() {
        return organisationUnitService.getFocusGroups();
    }

    @GetMapping("/api/topicTeams")
    public List<OrganisationUnit> getTopicTeams() {
        return organisationUnitService.getTopicTeams();
    }

    @GetMapping("/api/organisationStructure")
    public List<OrganisationUnit> getORganisationStructures() {
        return organisationUnitService.getOrganisationStructures();
    }
}