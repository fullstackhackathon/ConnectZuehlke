package ch.zuehlke.fullstack.ConnectZuehlke.rest;

import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightEmployeeService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EmployeeRestController.class,
        properties = {"insight.authentication.username=test", "insight.authentication.password=ImJustFake"})
public class EmployeeRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private InsightEmployeeService employeeService;

    @Test
    public void testGetEmptyUsers() throws Exception {
        when(employeeService.getEmployees()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/api/employees"))
                .andExpect(content().json("[]"));

    }

    @Test
    public void testGetUsers() throws Exception {
        when(employeeService.getEmployees()).thenReturn(Arrays.asList(new Employee("Max", "Mustermann")));
        mockMvc.perform(get("/api/employees"))
                .andExpect(content().json("[\n" +
                        "  {\n" +
                        "    \"firstName\": \"Max\",\n" +
                        "    \"lastName\": \"Mustermann\"\n" +
                        "  }\n" +
                        "]"));

    }
}

