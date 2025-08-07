package org.example.springdeployeement.controller;

import org.example.springdeployeement.entity.Customer;
import org.example.springdeployeement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getCustomers() {
        return customerService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        System.out.println("customer" + customer);
        return ResponseEntity.ok(customerService.save(customer));
    }

    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.update(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        customerService.delete(id);
    }
}
