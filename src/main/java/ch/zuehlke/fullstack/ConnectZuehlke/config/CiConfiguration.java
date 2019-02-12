package ch.zuehlke.fullstack.ConnectZuehlke.config;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.MockedEmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("ci")
@Configuration
public class CiConfiguration {

    @Bean
    @Primary
    public InsightEmployeeService employeeService() {
        System.out.println("EMPLOYEE MOCK ================");
        return new MockedEmployeeService();
    }
}
