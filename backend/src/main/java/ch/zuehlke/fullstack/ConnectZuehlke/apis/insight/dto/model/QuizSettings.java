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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

/**
 * QuizSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class QuizSettings {

    @JsonProperty("OrganisationUnits")

    private List<Long> organisationUnits = null;

    public QuizSettings organisationUnits(List<Long> organisationUnits) {
        this.organisationUnits = organisationUnits;
        return this;
    }

    public QuizSettings addOrganisationUnitsItem(Long organisationUnitsItem) {
        if (this.organisationUnits == null) {
            this.organisationUnits = new ArrayList<Long>();
        }
        this.organisationUnits.add(organisationUnitsItem);
        return this;
    }

    /**
     * Get organisationUnits
     *
     * @return organisationUnits
     **/
    @Schema(description = "")
    public List<Long> getOrganisationUnits() {
        return organisationUnits;
    }

    public void setOrganisationUnits(List<Long> organisationUnits) {
        this.organisationUnits = organisationUnits;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuizSettings quizSettings = (QuizSettings) o;
        return Objects.equals(this.organisationUnits, quizSettings.organisationUnits);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(organisationUnits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuizSettings {\n");

        sb.append("    organisationUnits: ").append(toIndentedString(organisationUnits)).append("\n");
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
