package com.kapil.learn.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kapil.learn.model.Customer;

public interface CustomerRepo extends MongoRepository<Customer, Long> {

	public List<Customer> findByName(String name);
	
}
