package ch.zuehlke.fullstack.ConnectZuehlke.rest;


import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class EmployeeRestController {

    @RequestMapping("/api/employees")
    public List<Employee> employeeList() {
        return Collections.emptyList();
    }
}