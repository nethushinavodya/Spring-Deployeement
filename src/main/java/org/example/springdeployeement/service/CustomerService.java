package org.example.springdeployeement.service;

import org.example.springdeployeement.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    Customer update(Customer customer);
    void delete(Long id);
    Customer save(Customer customer);
}
