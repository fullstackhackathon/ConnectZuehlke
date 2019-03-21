package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;

import java.io.IOException;
import java.util.List;

public interface InsightProjectService {
    List<Project> getProjects();
    Project getProject(String code);
    List<Project> getCurrentProjectsFor(Employee employee);
    List<Employee> getCurrentEmployeesFor(Project project);
    byte[] getProjectPicture(String projectCode) throws IOException;

}
