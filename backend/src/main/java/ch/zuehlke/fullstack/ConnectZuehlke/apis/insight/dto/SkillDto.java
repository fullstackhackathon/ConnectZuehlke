package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Skill;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class SkillDto {

    @JsonProperty("Id")
    private int Id;

    @JsonProperty("Name")
    private String Name;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public Skill toSkill() {
        return new Skill(getId(),getName());
    }
}
