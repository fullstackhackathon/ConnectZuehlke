package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;

import java.util.Arrays;
import java.util.List;

public class MockedEmployeeService extends InsightEmployeeService {

    public MockedEmployeeService() {
        super();
    }

    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee("Klaus", "Mustermann"),
                new Employee("Magda", "Müller"),
                new Employee("Kurt", "Peters")
        );
    }
}
