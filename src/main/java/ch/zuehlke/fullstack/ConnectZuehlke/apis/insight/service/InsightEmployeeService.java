package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import java.util.List;

public interface InsightEmployeeService {

  List<Employee> getEmployees();
}
