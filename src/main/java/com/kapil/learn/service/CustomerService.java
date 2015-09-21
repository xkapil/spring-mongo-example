package com.kapil.learn.service;

import java.util.List;

import com.kapil.learn.model.Customer;

public interface CustomerService {

	public List<Customer> findAll();

	public List<Customer> findByName(String name);

	public Customer save(Customer cust);

}
