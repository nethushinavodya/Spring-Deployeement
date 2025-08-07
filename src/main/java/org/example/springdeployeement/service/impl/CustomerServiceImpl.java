package org.example.springdeployeement.service.impl;

import jakarta.transaction.Transactional;
import org.example.springdeployeement.entity.Customer;
import org.example.springdeployeement.repo.CustomerRepo;
import org.example.springdeployeement.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public void update(Customer customer) {
         customerRepo.update(customer.getName(), customer.getEmail(), customer.getAddress(), customer.getId());
    }

    @Override
    public void delete(Long id) {
        customerRepo.deleteById(id);
    }
}
