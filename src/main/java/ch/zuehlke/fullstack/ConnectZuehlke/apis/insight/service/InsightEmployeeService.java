package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.config.InsightConfiguration;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.EmployeeDto;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.Authenticator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InsightEmployeeService {

    private final RestTemplate restTemplate;

    public InsightEmployeeService() {
        this.restTemplate = null;
    }

    @Autowired
    public InsightEmployeeService(
            RestTemplateBuilder restTemplateBuilder,
            InsightConfiguration insightConfiguration
    ) {
        this.restTemplate = restTemplateBuilder
                .rootUri(insightConfiguration.getUrl())
                .build();
        Authenticator.setDefault(insightConfiguration.getAuthenticator());
    }

    public List<Employee> getEmployees() {
        ResponseEntity<List<EmployeeDto>> response = this.restTemplate.exchange(
                "/employees",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<EmployeeDto>>() {
                });
        return response.getBody()
                .stream()
                .map(EmployeeDto::toEmployee)
                .collect(Collectors.toList());
    }
}
