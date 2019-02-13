package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
@Profile({"ci", "default"})
public class MockedInsightEmployeeService implements InsightEmployeeService {

    public List<Employee> getEmployees() {
        return asList(
                new Employee("Klaus", "Mustermann"),
                new Employee("Magda", "Müller"),
                new Employee("Kurt", "Peters")
        );
    }
}
