package ch.zuehlke.fullstack.ConnectZuehlke.domain;

import java.util.List;

public class OrganisationUnit {

    private String id;
    private String name;
    private int type; //1 -> OrgStruct, 2 -> Team, 3 -> FocusGroup, 5 -> TopicTeam
    private List<OrganisationUnit> children;

    private OrganisationUnit() {
    }

    public OrganisationUnit(String id, String name, int type, List<OrganisationUnit> children) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public List<OrganisationUnit> getChildren() {
        return children;
    }

    public boolean isTeam() {
        return this.type == 2;
    }

    public boolean isFocusGroup() {
        return this.type == 3;
    }

    public boolean isTopicTeam() {
        return this.type == 5;
    }

    public boolean isOrganisationStructure() {
        return this.type == 1;
    }
}
