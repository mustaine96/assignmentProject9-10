package com.capgemini.assignmentItems.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.assignmentItems.entity.Items;
import com.capgemini.assignmentItems.entity.Order;
import com.capgemini.assignmentItems.service.OrderService;

@RestController
public class OrderController {
	
	HashMap<Long, Set<Items>> cart;
	
	

	public OrderController() {
		super();
		cart = new HashMap<>();
	}

	

	@Autowired
	private OrderService service;
	
	@PostMapping ("/additem/{customerId}")
	public ResponseEntity<HashMap<Long,Set<Items>>> addItem(@PathVariable long customerId, @RequestBody Items item){
		
		Set<Items> tempItem= cart.get(customerId);
		if(tempItem==null) {
			tempItem=new HashSet<>();
			tempItem.add(item);
			cart.put(customerId, tempItem);
		}
		else {
			tempItem.add(item);
			cart.put(customerId, tempItem);
		}
		ResponseEntity<HashMap<Long,Set<Items>>> responseEntity = new ResponseEntity<HashMap<Long,Set<Items>>>(cart,HttpStatus.OK);
		return responseEntity;
	}
	
	@PostMapping("/submitOrder")
	public ResponseEntity<Order> placeOrder( @RequestBody Order order){
		service.submitOrder(order);
		ResponseEntity<Order> submitOrder= new ResponseEntity<Order>(order,HttpStatus.OK);
		return submitOrder;
		
		
		
		
	}
	
	
	
	
	
	
	

}
