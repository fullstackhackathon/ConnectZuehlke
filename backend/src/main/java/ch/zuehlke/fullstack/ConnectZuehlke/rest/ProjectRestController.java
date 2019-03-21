package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightProjectService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Project;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/projects")
public class ProjectRestController {
    private static final List<String> PROJECTS = Arrays.asList(
            "C23438", // SNB PRIMA
            "C23439", // SNB EASYR
            "C23440", // SNB ESIP
            "C22520", // SCS COMS
            "C22520", // SCS IAM
            "C23719", // SCS P2S
            "C23782", // VONTOBEL sky
            "C23781", // VONTOBEL RM
            "C23410", // SBB PRED MAINT
            "C23226", // SBB ETR610
            "C19834", // SBB automat
            "C23043" // CONCORDIA mobile app
    );
    private final InsightProjectService insightProjectService;

    public ProjectRestController(InsightProjectService insightProjectService, InsightEmployeeService insightEmployeeService) {
        this.insightProjectService = insightProjectService;
    }

    @GetMapping("")
    public List<Project> getProjects() {
        return PROJECTS.stream()
                .map(insightProjectService::getProject)
                .collect(Collectors.toList());
    }


    @GetMapping("{code}")
    public Project getProject(@PathVariable String code) {
        return insightProjectService.getProject(code);
    }

    @GetMapping("{code}/team")
    public List<Employee> getProjectTeam(@PathVariable String code) {
        Project project = insightProjectService.getProject(code);
        return insightProjectService.getCurrentEmployeesFor(project);
    }

    @GetMapping(value = "{code}/picture",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody
    byte[] getProjectPicture(@PathVariable String code) throws IOException {
        return insightProjectService.getProjectPicture(code);
    }
}
