package com.kapil.learn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kapil.learn.model.Customer;
import com.kapil.learn.repo.CustomerRepo;
import com.kapil.learn.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;


	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

	public List<Customer> findByName(String name) {
		return customerRepo.findByName(name);
	}

/*	public List<Order> findAllOrdersByCustomer(Long custId) {
		Customer customer = findOne(custId);
		return orderRepo.findByCustomer(customer);
	}
*/
	public void setCustomerRepo(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

	public Customer save(Customer cust) {
		return customerRepo.save(cust);
	}

}
