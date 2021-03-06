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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * AlertSubscription
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class AlertSubscription {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Alert")

    private Alert alert = null;

    @JsonProperty("Filter")

    private String filter = null;

    public AlertSubscription id(Long id) {
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

    public AlertSubscription alert(Alert alert) {
        this.alert = alert;
        return this;
    }


    /**
     * Get alert
     *
     * @return alert
     **/
    @Schema(description = "")
    public Alert getAlert() {
        return alert;
    }

    public void setAlert(Alert alert) {
        this.alert = alert;
    }

    public AlertSubscription filter(String filter) {
        this.filter = filter;
        return this;
    }


    /**
     * Get filter
     *
     * @return filter
     **/
    @Schema(description = "")
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlertSubscription alertSubscription = (AlertSubscription) o;
        return Objects.equals(this.id, alertSubscription.id) &&
                Objects.equals(this.alert, alertSubscription.alert) &&
                Objects.equals(this.filter, alertSubscription.filter);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, alert, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertSubscription {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
