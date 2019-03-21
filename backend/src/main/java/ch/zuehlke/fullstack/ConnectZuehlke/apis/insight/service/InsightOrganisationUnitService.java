package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.OrganisationUnit;

import java.util.List;

public interface InsightOrganisationUnitService {

    List<OrganisationUnit> getTeams();

    List<OrganisationUnit> getFocusGroups();

    List<OrganisationUnit> getTopicTeams();

    List<OrganisationUnit> getOrganisationStructures();
}
