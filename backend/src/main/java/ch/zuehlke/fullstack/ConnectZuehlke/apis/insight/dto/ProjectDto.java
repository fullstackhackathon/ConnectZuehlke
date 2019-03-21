package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonIgnoreProperties
public class ProjectDto {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Project toProject() {
        return new Project(
                getCode(),
                getName(),
                getDescription()
        );
    }

}
