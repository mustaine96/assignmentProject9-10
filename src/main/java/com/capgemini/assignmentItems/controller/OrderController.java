package com.capgemini.assignmentItems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.assignmentItems.entity.Order;
import com.capgemini.assignmentItems.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping ("/order")
	public ResponseEntity<Order> newOrder(@RequestBody Order order){

		ResponseEntity<Order> responseEntity=new ResponseEntity<Order>(service.submitOrder(order),HttpStatus.OK);
		
		return responseEntity;
	}
	

}
