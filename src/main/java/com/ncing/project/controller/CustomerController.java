package com.ncing.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncing.project.entity.Customer;
import com.ncing.project.service.CustomerService;

import com.ncing.project.util.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(AppConstants.BASE_URL)
public class CustomerController {
	
	@Autowired
    private CustomerService customerService;

    @PostMapping(AppConstants.CUSTOMERS_URL)
    public ResponseEntity<?> addCustomers(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.saveCustomers(customer), HttpStatus.OK);
    }

    @GetMapping(AppConstants.CUSTOMERS_URL)
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>
                (customerService.getCustomersList(), HttpStatus.OK);
    }

    @DeleteMapping(AppConstants.CUSTOMERS_BY_ID_URL)
    public void deleteCustomers(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }

}
