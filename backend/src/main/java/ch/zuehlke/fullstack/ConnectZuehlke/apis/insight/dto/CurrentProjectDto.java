package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class CurrentProjectDto {

    @JsonProperty("Project")
    private ProjectDto project;

    @JsonProperty("Descriptions")
    private DescriptionDto description;

    public ProjectDto getProject() {
        return project;
    }

    public DescriptionDto getDescription() {
        return description;
    }
}
