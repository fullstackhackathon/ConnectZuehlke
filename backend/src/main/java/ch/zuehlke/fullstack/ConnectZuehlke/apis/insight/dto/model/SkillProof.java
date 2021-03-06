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

package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * SkillProof
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class SkillProof {
    @JsonProperty("Source")

    private SourceEnum source = null;
    @JsonProperty("SourceText")

    private String sourceText = null;
    @JsonProperty("Project")

    private Project project = null;
    @JsonProperty("EndorsmentEmployee")

    private Employee endorsmentEmployee = null;
    @JsonProperty("IsEndorsementApproved")

    private Boolean isEndorsementApproved = null;
    @JsonProperty("ProofDate")

    private OffsetDateTime proofDate = null;
    @JsonProperty("Days")

    private Double days = null;
    @JsonProperty("Url")

    private String url = null;
    @JsonProperty("Level")

    private LevelEnum level = null;
    @JsonProperty("LevelText")

    private String levelText = null;
    @JsonProperty("Experience")

    private Double experience = null;
    @JsonProperty("Description")

    private String description = null;

    public SkillProof source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     **/
    @Schema(description = "")
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    /**
     * Get sourceText
     *
     * @return sourceText
     **/
    @Schema(description = "")
    public String getSourceText() {
        return sourceText;
    }

    public SkillProof project(Project project) {
        this.project = project;
        return this;
    }

    /**
     * Get project
     *
     * @return project
     **/
    @Schema(description = "")
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public SkillProof endorsmentEmployee(Employee endorsmentEmployee) {
        this.endorsmentEmployee = endorsmentEmployee;
        return this;
    }

    /**
     * Get endorsmentEmployee
     *
     * @return endorsmentEmployee
     **/
    @Schema(description = "")
    public Employee getEndorsmentEmployee() {
        return endorsmentEmployee;
    }

    public void setEndorsmentEmployee(Employee endorsmentEmployee) {
        this.endorsmentEmployee = endorsmentEmployee;
    }

    public SkillProof isEndorsementApproved(Boolean isEndorsementApproved) {
        this.isEndorsementApproved = isEndorsementApproved;
        return this;
    }

    /**
     * Get isEndorsementApproved
     *
     * @return isEndorsementApproved
     **/
    @Schema(description = "")
    public Boolean isIsEndorsementApproved() {
        return isEndorsementApproved;
    }

    public void setIsEndorsementApproved(Boolean isEndorsementApproved) {
        this.isEndorsementApproved = isEndorsementApproved;
    }

    public SkillProof proofDate(OffsetDateTime proofDate) {
        this.proofDate = proofDate;
        return this;
    }

    /**
     * Get proofDate
     *
     * @return proofDate
     **/
    @Schema(description = "")
    public OffsetDateTime getProofDate() {
        return proofDate;
    }

    public void setProofDate(OffsetDateTime proofDate) {
        this.proofDate = proofDate;
    }

    public SkillProof days(Double days) {
        this.days = days;
        return this;
    }

    /**
     * Get days
     *
     * @return days
     **/
    @Schema(description = "")
    public Double getDays() {
        return days;
    }

    public void setDays(Double days) {
        this.days = days;
    }

    public SkillProof url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     **/
    @Schema(description = "")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SkillProof level(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * Get level
     *
     * @return level
     **/
    @Schema(description = "")
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    /**
     * Get levelText
     *
     * @return levelText
     **/
    @Schema(description = "")
    public String getLevelText() {
        return levelText;
    }

    public SkillProof experience(Double experience) {
        this.experience = experience;
        return this;
    }

    /**
     * Get experience
     *
     * @return experience
     **/
    @Schema(description = "")
    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }

    public SkillProof description(String description) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillProof skillProof = (SkillProof) o;
        return Objects.equals(this.source, skillProof.source) &&
                Objects.equals(this.sourceText, skillProof.sourceText) &&
                Objects.equals(this.project, skillProof.project) &&
                Objects.equals(this.endorsmentEmployee, skillProof.endorsmentEmployee) &&
                Objects.equals(this.isEndorsementApproved, skillProof.isEndorsementApproved) &&
                Objects.equals(this.proofDate, skillProof.proofDate) &&
                Objects.equals(this.days, skillProof.days) &&
                Objects.equals(this.url, skillProof.url) &&
                Objects.equals(this.level, skillProof.level) &&
                Objects.equals(this.levelText, skillProof.levelText) &&
                Objects.equals(this.experience, skillProof.experience) &&
                Objects.equals(this.description, skillProof.description);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(source, sourceText, project, endorsmentEmployee, isEndorsementApproved, proofDate, days, url, level, levelText, experience, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillProof {\n");

        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceText: ").append(toIndentedString(sourceText)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    endorsmentEmployee: ").append(toIndentedString(endorsmentEmployee)).append("\n");
        sb.append("    isEndorsementApproved: ").append(toIndentedString(isEndorsementApproved)).append("\n");
        sb.append("    proofDate: ").append(toIndentedString(proofDate)).append("\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    levelText: ").append(toIndentedString(levelText)).append("\n");
        sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    /**
     * Gets or Sets source
     */
    public enum SourceEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2),
        NUMBER_3(3),
        NUMBER_4(4),
        NUMBER_5(5),
        NUMBER_6(6),
        NUMBER_7(7),
        NUMBER_8(8),
        NUMBER_9(9),
        NUMBER_11(11),
        NUMBER_12(12),
        NUMBER_13(13),
        NUMBER_14(14),
        NUMBER_15(15);

        private Integer value;

        SourceEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static SourceEnum fromValue(String text) {
            for (SourceEnum b : SourceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

    }

    /**
     * Gets or Sets level
     */
    public enum LevelEnum {
        NUMBER_0(0),
        NUMBER_1(1),
        NUMBER_2(2),
        NUMBER_4(4),
        NUMBER_5(5),
        NUMBER_6(6);

        private Integer value;

        LevelEnum(Integer value) {
            this.value = value;
        }

        @JsonCreator
        public static LevelEnum fromValue(String text) {
            for (LevelEnum b : LevelEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

    }

}
