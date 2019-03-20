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
            new Customer(18444, "Test AG, Wikon", "Bahnhofstrasse 33", "Wikon", "Schweiz", 4806, 7.9790377484264, 47.2676948098177),
            new Customer(18445, "Zühlke Engineering AG", "Wiesenstrasse 10a", "Schlieren", "Schweiz", 8956, 8.4415769, 47.4000486),
            new Customer(18446, "Sebastian AG, Zürich", "Seefeldstrasse 147", "Zürich", "Schweiz", 8008, 8.5537504, 47.3565633)
    );


    @Override
    public List<Customer> getCustomers() {
        return CUSTOMERS;
    }
}
