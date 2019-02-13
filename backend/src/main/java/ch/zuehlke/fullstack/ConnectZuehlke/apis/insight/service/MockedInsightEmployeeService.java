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
                new Employee("Klaus", "Mustermann", 1),
                new Employee("Magda", "Müller", 2),
                new Employee("Kurt", "Peters", 3)
        );
    }
}
