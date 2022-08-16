package com.ncing.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ncing.project.entity.Customer;


public interface CustomerService {
	
	// Save operation
    Customer saveCustomers(Customer customer);
  
    // Read operation
    List<Customer> getCustomersList();
  
    // Delete operation
    void deleteCustomer(Long id);


}
