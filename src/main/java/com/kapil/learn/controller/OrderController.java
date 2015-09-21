package com.kapil.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kapil.learn.model.Order;
import com.kapil.learn.service.OrderService;

@RestController
@RequestMapping(value = "/api/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(method = RequestMethod.POST)
	public Order save(@RequestBody Order customer) {
		return orderService.save(customer);
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

}
