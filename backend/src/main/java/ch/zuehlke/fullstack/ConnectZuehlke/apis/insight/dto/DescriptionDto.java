package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Description;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Skill;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties
public class DescriptionDto {

    @JsonProperty("Id")
    private int id;

    @JsonProperty("Skills")
    private List<SkillDto> skills;

    public int getId() {
        return id;
    }

    public List<SkillDto> getSkills() {
        return skills;
    }
}
