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

import ch.zuehlke.insight.client.model.Industry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

/**
 * EmployeeProject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class EmployeeProject {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("From")

    private OffsetDateTime from = null;

    @JsonProperty("To")

    private OffsetDateTime to = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("Customer")

    private String customer = null;

    @JsonProperty("Description")

    private String description = null;

    @JsonProperty("Industry")

    private Industry industry = null;

    public EmployeeProject id(Long id) {
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

    public EmployeeProject from(OffsetDateTime from) {
        this.from = from;
        return this;
    }


    /**
     * Get from
     *
     * @return from
     **/
    @Schema(description = "")
    public OffsetDateTime getFrom() {
        return from;
    }

    public void setFrom(OffsetDateTime from) {
        this.from = from;
    }

    public EmployeeProject to(OffsetDateTime to) {
        this.to = to;
        return this;
    }


    /**
     * Get to
     *
     * @return to
     **/
    @Schema(description = "")
    public OffsetDateTime getTo() {
        return to;
    }

    public void setTo(OffsetDateTime to) {
        this.to = to;
    }

    public EmployeeProject name(String name) {
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

    public EmployeeProject customer(String customer) {
        this.customer = customer;
        return this;
    }


    /**
     * Get customer
     *
     * @return customer
     **/
    @Schema(description = "")
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public EmployeeProject description(String description) {
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

    public EmployeeProject industry(Industry industry) {
        this.industry = industry;
        return this;
    }


    /**
     * Get industry
     *
     * @return industry
     **/
    @Schema(description = "")
    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeProject employeeProject = (EmployeeProject) o;
        return Objects.equals(this.id, employeeProject.id) &&
                Objects.equals(this.from, employeeProject.from) &&
                Objects.equals(this.to, employeeProject.to) &&
                Objects.equals(this.name, employeeProject.name) &&
                Objects.equals(this.customer, employeeProject.customer) &&
                Objects.equals(this.description, employeeProject.description) &&
                Objects.equals(this.industry, employeeProject.industry);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, from, to, name, customer, description, industry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmployeeProject {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
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