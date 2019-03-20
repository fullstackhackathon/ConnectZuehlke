package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Customer;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
@Profile({"ci", "default"})
public class InsightCustomerServiceMocked implements InsightCustomerService {

    public static final List<Customer> CUSTOMERS = asList(
            new Customer(18444, "Test AG, Wikon", "Bahnhofstrasse 33", "Wikon", "Schweiz", 4806, 7.9790377484264, 47.2676948098177)
    );


    @Override
    public List<Customer> getCustomers() {
        return CUSTOMERS;
    }
}
