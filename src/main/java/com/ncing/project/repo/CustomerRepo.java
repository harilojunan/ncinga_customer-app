package com.ncing.project.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ncing.project.entity.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, Long> {

}