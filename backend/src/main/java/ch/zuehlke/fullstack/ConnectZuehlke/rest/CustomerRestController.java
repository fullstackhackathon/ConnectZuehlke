package ch.zuehlke.fullstack.ConnectZuehlke.rest;


import ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service.InsightCustomerService;
import ch.zuehlke.fullstack.ConnectZuehlke.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
    private final InsightCustomerService customerService;

    public CustomerRestController(InsightCustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/api/customers")
    public List<Customer> customerList() {
        return customerService.getCustomers();
    }


}