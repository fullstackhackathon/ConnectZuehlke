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

import ch.zuehlke.insight.client.model.SmallQuizAnswerEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

/**
 * SmallQuizQuestionEntity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class SmallQuizQuestionEntity {

    @JsonProperty("Id")

    private Long id = null;

    @JsonProperty("Text")

    private String text = null;

    @JsonProperty("Progress")

    private Integer progress = null;

    @JsonProperty("Answers")

    private List<SmallQuizAnswerEntity> answers = null;

    public SmallQuizQuestionEntity id(Long id) {
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

    public SmallQuizQuestionEntity text(String text) {
        this.text = text;
        return this;
    }


    /**
     * Get text
     *
     * @return text
     **/
    @Schema(description = "")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SmallQuizQuestionEntity progress(Integer progress) {
        this.progress = progress;
        return this;
    }


    /**
     * Get progress
     *
     * @return progress
     **/
    @Schema(description = "")
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public SmallQuizQuestionEntity answers(List<SmallQuizAnswerEntity> answers) {
        this.answers = answers;
        return this;
    }

    public SmallQuizQuestionEntity addAnswersItem(SmallQuizAnswerEntity answersItem) {
        if (this.answers == null) {
            this.answers = new ArrayList<SmallQuizAnswerEntity>();
        }
        this.answers.add(answersItem);
        return this;
    }

    /**
     * Get answers
     *
     * @return answers
     **/
    @Schema(description = "")
    public List<SmallQuizAnswerEntity> getAnswers() {
        return answers;
    }

    public void setAnswers(List<SmallQuizAnswerEntity> answers) {
        this.answers = answers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmallQuizQuestionEntity smallQuizQuestionEntity = (SmallQuizQuestionEntity) o;
        return Objects.equals(this.id, smallQuizQuestionEntity.id) &&
                Objects.equals(this.text, smallQuizQuestionEntity.text) &&
                Objects.equals(this.progress, smallQuizQuestionEntity.progress) &&
                Objects.equals(this.answers, smallQuizQuestionEntity.answers);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, text, progress, answers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmallQuizQuestionEntity {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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