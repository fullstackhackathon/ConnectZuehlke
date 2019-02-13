package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"insight.authentication.username=test", "insight.authentication.password=ImJustFake"})
@ActiveProfiles("prod")
public class ProdInsightEmployeeServiceTest {

    @Autowired
    private InsightEmployeeService employeeService;

    @Test
    public void testDefaultProfileReturnsMockedInsightEmployeeService() {
        assertTrue(employeeService instanceof RemoteInsightEmployeeService);
    }
}