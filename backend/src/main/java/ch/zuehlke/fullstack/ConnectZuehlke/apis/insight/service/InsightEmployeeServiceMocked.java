package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.apache.commons.io.IOUtils;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

import static java.util.Arrays.asList;

@Service
@Profile({"ci", "default"})
public class InsightEmployeeServiceMocked implements InsightEmployeeService {

    public static final List<Employee> EMPLOYEES = asList(
            Employee.builder().firstName("Klaus").lastName("Mustermann").id(1).code("kmu").build(),
            Employee.builder().firstName("Magda").lastName("Müller").id(2).code("mam").build(),
            Employee.builder().firstName("Kurs").lastName("Peters").id(3).code("kpe").build()
    );

    public List<Employee> getEmployees() {
        return EMPLOYEES;
    }

    @Override
    public byte[] getEmployeePicture(int id) throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("demo_picture.jpg");
        return IOUtils.toByteArray(classPathResource.getInputStream());
    }

    @Override
    public Employee getEmployee(String code) {
        return EMPLOYEES.stream()
                .filter(employee -> employee.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}
