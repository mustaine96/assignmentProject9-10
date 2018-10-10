package com.capgemini.assignmentItems.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.assignmentItems.entity.Order;

public interface OrderRepository extends MongoRepository<Order, Integer>{
	

}
