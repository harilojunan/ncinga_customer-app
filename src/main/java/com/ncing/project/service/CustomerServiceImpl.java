package com.ncing.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncing.project.entity.Customer;
import com.ncing.project.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo customerRepo;


	@Override
	public Customer saveCustomers(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getCustomersList() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public void deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(id);
		
	}

}
