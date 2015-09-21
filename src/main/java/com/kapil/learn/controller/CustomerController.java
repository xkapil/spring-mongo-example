package com.kapil.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kapil.learn.model.Customer;
import com.kapil.learn.service.CustomerService;

@RestController
@RequestMapping(value = "/api/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Customer> findAll() {
		System.out.println("Inside FindAll");
		return customerService.findAll();
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public List<Customer> findByName(@PathVariable String name) {
		System.out.println("Inside Find By Name");
		return customerService.findByName(name);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

}
