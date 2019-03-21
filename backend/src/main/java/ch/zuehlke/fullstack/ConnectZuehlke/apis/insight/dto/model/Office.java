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
 * Office
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class Office {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Name")

    private String name = null;

    @JsonProperty("CompanyName")

    private String companyName = null;

    @JsonProperty("CompanyId")

    private Long companyId = null;

    @JsonProperty("IsDistributedLocation")

    private Boolean isDistributedLocation = null;

    @JsonProperty("IsGroup")

    private Boolean isGroup = null;

    public Office id(Long id) {
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

    public Office name(String name) {
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

    public Office companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }


    /**
     * Get companyName
     *
     * @return companyName
     **/
    @Schema(description = "")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Office companyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }


    /**
     * Get companyId
     *
     * @return companyId
     **/
    @Schema(description = "")
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Office isDistributedLocation(Boolean isDistributedLocation) {
        this.isDistributedLocation = isDistributedLocation;
        return this;
    }


    /**
     * Get isDistributedLocation
     *
     * @return isDistributedLocation
     **/
    @Schema(description = "")
    public Boolean isIsDistributedLocation() {
        return isDistributedLocation;
    }

    public void setIsDistributedLocation(Boolean isDistributedLocation) {
        this.isDistributedLocation = isDistributedLocation;
    }

    public Office isGroup(Boolean isGroup) {
        this.isGroup = isGroup;
        return this;
    }


    /**
     * Get isGroup
     *
     * @return isGroup
     **/
    @Schema(description = "")
    public Boolean isIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Office office = (Office) o;
        return Objects.equals(this.id, office.id) &&
                Objects.equals(this.name, office.name) &&
                Objects.equals(this.companyName, office.companyName) &&
                Objects.equals(this.companyId, office.companyId) &&
                Objects.equals(this.isDistributedLocation, office.isDistributedLocation) &&
                Objects.equals(this.isGroup, office.isGroup);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name, companyName, companyId, isDistributedLocation, isGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Office {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
        sb.append("    isDistributedLocation: ").append(toIndentedString(isDistributedLocation)).append("\n");
        sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
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
