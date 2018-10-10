package com.capgemini.assignmentItems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.assignmentItems.entity.Items;
import com.capgemini.assignmentItems.entity.Order;
import com.capgemini.assignmentItems.service.ItemsService;
import com.capgemini.assignmentItems.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	@Autowired
	private ItemsService serviceI;
	
	@PostMapping ("/order")
	public ResponseEntity<Order> newOrder(@RequestBody Order order){

		ResponseEntity<Order> responseEntity=new ResponseEntity<Order>(service.submitOrder(order),HttpStatus.OK);
		
		return responseEntity;
	}
	
	@PostMapping ("/item")
	public ResponseEntity<Items> newOrder(@RequestBody Items item){

		ResponseEntity<Items> responseEntity=new ResponseEntity<Items>(serviceI.addItem(item),HttpStatus.OK);
		
		return responseEntity;
	}
	

}
