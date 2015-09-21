package com.kapil.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kapil.learn.model.Order;
import com.kapil.learn.repo.OrderRepo;
import com.kapil.learn.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepo orderRepo;

	/*
	 * public List<Order> findAllOrdersByCustomer(Long custId) { Customer
	 * customer = findOne(custId); return orderRepo.findByCustomer(customer); }
	 */

	@Override
	public Order save(Order order) {
		return orderRepo.save(order);
	}

	public void setOrderRepo(OrderRepo orderRepo) {
		this.orderRepo = orderRepo;
	}

}
