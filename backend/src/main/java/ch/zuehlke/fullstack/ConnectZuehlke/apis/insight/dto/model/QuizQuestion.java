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

import ch.zuehlke.insight.client.model.QuizQuestionChoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

/**
 * QuizQuestion
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-03-21T13:18:19.970506+01:00[Europe/Zurich]")
public class QuizQuestion {

    @JsonProperty("Choices")

    private List<QuizQuestionChoice> choices = null;

    @JsonProperty("Solution")

    private String solution = null;

    @JsonProperty("UserThumb")

    private String userThumb = null;

    public QuizQuestion choices(List<QuizQuestionChoice> choices) {
        this.choices = choices;
        return this;
    }

    public QuizQuestion addChoicesItem(QuizQuestionChoice choicesItem) {
        if (this.choices == null) {
            this.choices = new ArrayList<QuizQuestionChoice>();
        }
        this.choices.add(choicesItem);
        return this;
    }

    /**
     * Get choices
     *
     * @return choices
     **/
    @Schema(description = "")
    public List<QuizQuestionChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<QuizQuestionChoice> choices) {
        this.choices = choices;
    }

    public QuizQuestion solution(String solution) {
        this.solution = solution;
        return this;
    }


    /**
     * Get solution
     *
     * @return solution
     **/
    @Schema(description = "")
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public QuizQuestion userThumb(String userThumb) {
        this.userThumb = userThumb;
        return this;
    }


    /**
     * Get userThumb
     *
     * @return userThumb
     **/
    @Schema(description = "")
    public String getUserThumb() {
        return userThumb;
    }

    public void setUserThumb(String userThumb) {
        this.userThumb = userThumb;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuizQuestion quizQuestion = (QuizQuestion) o;
        return Objects.equals(this.choices, quizQuestion.choices) &&
                Objects.equals(this.solution, quizQuestion.solution) &&
                Objects.equals(this.userThumb, quizQuestion.userThumb);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(choices, solution, userThumb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuizQuestion {\n");

        sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    userThumb: ").append(toIndentedString(userThumb)).append("\n");
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
