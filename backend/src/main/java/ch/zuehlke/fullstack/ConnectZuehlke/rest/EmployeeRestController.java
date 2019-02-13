package ch.zuehlke.fullstack.ConnectZuehlke.rest;


import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
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

    @GetMapping("/api/employee/{code}")
    public Employee employee(@PathVariable(value = "code") String code) {
        return employeeService.getEmployee(code);
    }

    @GetMapping(value = "/api/employee/{id}/picture",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody
    byte[] getEmployeePicture(@PathVariable(value = "id") int id) throws IOException {
        return employeeService.getEmployeePicture(id);
    }
}