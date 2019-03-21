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

/**
 * UserSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class UserSettings {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("ShowBirthday")

    private Boolean showBirthday = null;

    public UserSettings id(Long id) {
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

    public UserSettings showBirthday(Boolean showBirthday) {
        this.showBirthday = showBirthday;
        return this;
    }


    /**
     * Get showBirthday
     *
     * @return showBirthday
     **/
    @Schema(description = "")
    public Boolean isShowBirthday() {
        return showBirthday;
    }

    public void setShowBirthday(Boolean showBirthday) {
        this.showBirthday = showBirthday;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserSettings userSettings = (UserSettings) o;
        return Objects.equals(this.id, userSettings.id) &&
                Objects.equals(this.showBirthday, userSettings.showBirthday);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, showBirthday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSettings {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    showBirthday: ").append(toIndentedString(showBirthday)).append("\n");
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
