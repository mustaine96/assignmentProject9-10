package com.capgemini.assignmentItems.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.assignmentItems.entity.Items;
import com.capgemini.assignmentItems.entity.Order;
import com.capgemini.assignmentItems.repository.OrderRepository;
import com.capgemini.assignmentItems.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public Order submitOrder(Order order) {
//		Random r = new Random();
//		r.nextInt(0)+100;
		//order.setStatus("new Order");
		order.setDate(LocalDate.now());
		
		return orderRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		Optional<Order> optional = orderRepository.findById(order.getOrderId());
		if (optional.isPresent()) {
			optional.get().setStatus("Completed");
			return orderRepository.save(optional.get());
		}
		return null;
	}

	@Override
	public Order cancelOrder(int orderId) {
		Optional<Order> optional = orderRepository.findById(orderId);
		if (optional.isPresent()) {
			optional.get().setStatus("Cancelled");
			return orderRepository.save(optional.get());
		}
		return null;
	}

	@Override
	public Order deleteOrder(int orderId) {
		Optional<Order> optional = orderRepository.findById(orderId);
		if (optional.isPresent()) {
			optional.get().setStatus("Deleted");
			return orderRepository.save(optional.get());
		}
		return null;
	}

	@Override
	public Order getOrder(int orderId) {
		Optional<Order> optional = orderRepository.findById(orderId);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}



	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
