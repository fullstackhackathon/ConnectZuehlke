package ch.zuehlke.fullstack.ConnectZuehlke.rest;


import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestController {
    private final InsightEmployeeService employeeService;

    public EmployeeRestController(InsightEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/api/employees")
    public List<Employee> employeeList() {
        return employeeService.getEmployees();
    }
}