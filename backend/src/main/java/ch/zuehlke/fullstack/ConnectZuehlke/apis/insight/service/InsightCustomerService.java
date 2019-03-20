package ch.zuehlke.fullstack.ConnectZuehlke.apis.insight.service;

import ch.zuehlke.fullstack.ConnectZuehlke.domain.Customer;

import java.util.List;

public interface InsightCustomerService {
    List<Customer> getCustomers();
}
