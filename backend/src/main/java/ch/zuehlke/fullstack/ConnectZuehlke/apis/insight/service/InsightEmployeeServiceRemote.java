package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.EmployeeDto;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpMethod.GET;

@Service
@Profile({"prod", "staging"})
public class InsightEmployeeServiceRemote implements InsightEmployeeService {
    private final RestTemplate insightRestTemplate;


    @Autowired
    public InsightEmployeeServiceRemote(RestTemplate insightRestTemplate) {
        this.insightRestTemplate = insightRestTemplate;
    }

    @Override
    public List<Employee> getEmployees() {
        ResponseEntity<List<EmployeeDto>> response = this.insightRestTemplate
                .exchange("/employees", GET, null, new ParameterizedTypeReference<List<EmployeeDto>>() {
                });

        return response.getBody().stream()
                .map(EmployeeDto::toEmployee)
                .collect(toList());
    }

    @Override
    public byte[] getEmployeePicture(int id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_OCTET_STREAM));

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<byte[]> response = this.insightRestTemplate
                .exchange("/employees/" + id + "/picture?large=false", GET, entity, byte[].class, "1");
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        }
        throw new IllegalStateException("Status code was not 200");
    }

    @Override
    public Employee getEmployee(String code) {
        ResponseEntity<EmployeeDto> response = this.insightRestTemplate
                .getForEntity("/employees/" + code, EmployeeDto.class);

        return response.getBody().toEmployee();
    }
}
