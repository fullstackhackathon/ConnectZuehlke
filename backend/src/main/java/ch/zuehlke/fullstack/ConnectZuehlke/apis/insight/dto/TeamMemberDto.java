package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class TeamMemberDto {
    @JsonProperty("Employee")
    private EmployeeDto employee;

    public EmployeeDto getEmployee() {
        return employee;
    }
}
