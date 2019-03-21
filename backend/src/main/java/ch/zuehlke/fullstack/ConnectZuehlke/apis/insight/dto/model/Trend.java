/*
 * WebApi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.zuehlke.insight.client.model;

import java.util.Objects;

import ch.zuehlke.insight.client.model.ManagedSkill;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

/**
 * Trend
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class Trend {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("ShortDescription")

    private String shortDescription = null;

    @JsonProperty("Description")

    private String description = null;

    @JsonProperty("ManagedSkills")

    private List<ManagedSkill> managedSkills = null;

    public Trend id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * Get id
     *
     * @return id
     **/
    @Schema(description = "")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Trend name(String name) {
        this.name = name;
        return this;
    }


    /**
     * Get name
     *
     * @return name
     **/
    @Schema(description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trend shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }


    /**
     * Get shortDescription
     *
     * @return shortDescription
     **/
    @Schema(description = "")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Trend description(String description) {
        this.description = description;
        return this;
    }


    /**
     * Get description
     *
     * @return description
     **/
    @Schema(description = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Trend managedSkills(List<ManagedSkill> managedSkills) {
        this.managedSkills = managedSkills;
        return this;
    }

    public Trend addManagedSkillsItem(ManagedSkill managedSkillsItem) {
        if (this.managedSkills == null) {
            this.managedSkills = new ArrayList<ManagedSkill>();
        }
        this.managedSkills.add(managedSkillsItem);
        return this;
    }

    /**
     * Get managedSkills
     *
     * @return managedSkills
     **/
    @Schema(description = "")
    public List<ManagedSkill> getManagedSkills() {
        return managedSkills;
    }

    public void setManagedSkills(List<ManagedSkill> managedSkills) {
        this.managedSkills = managedSkills;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trend trend = (Trend) o;
        return Objects.equals(this.id, trend.id) &&
                Objects.equals(this.name, trend.name) &&
                Objects.equals(this.shortDescription, trend.shortDescription) &&
                Objects.equals(this.description, trend.description) &&
                Objects.equals(this.managedSkills, trend.managedSkills);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name, shortDescription, description, managedSkills);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Trend {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    managedSkills: ").append(toIndentedString(managedSkills)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
