package com.capgemini.assignmentItems.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.assignmentItems.entity.Order;
import com.capgemini.assignmentItems.exceptions.OrderNotFoundException;
import com.capgemini.assignmentItems.repository.OrderRepository;
import com.capgemini.assignmentItems.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repo;

	@Override
	public Order getOrder(int orderId) {
		Optional<Order> optionalOrder = repo.findById(orderId);
		if (optionalOrder.isPresent())
			return optionalOrder.get();
		throw new OrderNotFoundException("Order dont exist");

	}

	@Override
	public Order submitOrder(Order order) {

		return repo.save(order);

	}

	@Override
	public void updateOrder(Order order) {
		repo.save(order);
	}

	@Override
	public void deleteOrder(int orderId) {
		repo.deleteById(orderId);
	}

	@Override
	public void cancelOrder(int orderId) {
		repo.deleteById(orderId);

	}

}
