package com.kapil.learn.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kapil.learn.model.Order;

public interface OrderRepo extends MongoRepository<Order, Long> {

}
