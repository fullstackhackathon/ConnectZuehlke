package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightProjectService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/projects")
public class ProjectRestController {
    private final InsightProjectService insightProjectService;
    private final InsightEmployeeService insightEmployeeService;

    public ProjectRestController(InsightProjectService insightProjectService, InsightEmployeeService insightEmployeeService) {
        this.insightProjectService = insightProjectService;
        this.insightEmployeeService = insightEmployeeService;
    }

    @GetMapping("")
    public List<Project> getProjects() {
        return insightEmployeeService
                .getEmployees()
                .stream()
                .limit(10)
                .flatMap(employee -> insightProjectService.getCurrentProjectsFor(employee).stream())
                .distinct()
                .collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public Project getProject(@RequestParam String code) {
        return insightProjectService.getProject(code);
    }
}
