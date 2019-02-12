package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpMethod.GET;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.config.InsightProperties;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.dto.EmployeeDto;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import java.util.List;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Profile;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Profile("prod")
public class RemoteInsightEmployeeService implements InsightEmployeeService {

  private final RestTemplate restTemplate;

  public RemoteInsightEmployeeService(RestTemplateBuilder restTemplateBuilder, InsightProperties insightProperties) {
    this.restTemplate = restTemplateBuilder
        .rootUri(insightProperties.getUrl())
        .build();

    String user = insightProperties.getAuthentication().getUsername();
    String password = insightProperties.getAuthentication().getPassword();
    CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
    credentialsProvider.setCredentials(AuthScope.ANY, new NTCredentials(user, password, null, null));

    CloseableHttpClient httpclient = HttpClientBuilder.create().setDefaultCredentialsProvider(credentialsProvider).build();

    this.restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpclient));

  }

  @Override
  public List<Employee> getEmployees() {
    ResponseEntity<List<EmployeeDto>> response = this.restTemplate
        .exchange("/employees", GET, null, new ParameterizedTypeReference<List<EmployeeDto>>() {
        });

    return response.getBody().stream()
        .map(EmployeeDto::toEmployee)
        .collect(toList());
  }
}
