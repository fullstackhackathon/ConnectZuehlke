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
 * MergeTrainings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class MergeTrainings {

    @JsonProperty("MergeInto")

    private Long mergeInto = null;

    @JsonProperty("MergeList")

    private List<Long> mergeList = null;

    public MergeTrainings mergeInto(Long mergeInto) {
        this.mergeInto = mergeInto;
        return this;
    }


    /**
     * Get mergeInto
     *
     * @return mergeInto
     **/
    @Schema(description = "")
    public Long getMergeInto() {
        return mergeInto;
    }

    public void setMergeInto(Long mergeInto) {
        this.mergeInto = mergeInto;
    }

    public MergeTrainings mergeList(List<Long> mergeList) {
        this.mergeList = mergeList;
        return this;
    }

    public MergeTrainings addMergeListItem(Long mergeListItem) {
        if (this.mergeList == null) {
            this.mergeList = new ArrayList<Long>();
        }
        this.mergeList.add(mergeListItem);
        return this;
    }

    /**
     * Get mergeList
     *
     * @return mergeList
     **/
    @Schema(description = "")
    public List<Long> getMergeList() {
        return mergeList;
    }

    public void setMergeList(List<Long> mergeList) {
        this.mergeList = mergeList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MergeTrainings mergeTrainings = (MergeTrainings) o;
        return Objects.equals(this.mergeInto, mergeTrainings.mergeInto) &&
                Objects.equals(this.mergeList, mergeTrainings.mergeList);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(mergeInto, mergeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeTrainings {\n");

        sb.append("    mergeInto: ").append(toIndentedString(mergeInto)).append("\n");
        sb.append("    mergeList: ").append(toIndentedString(mergeList)).append("\n");
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
