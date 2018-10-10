package com.capgemini.assignmentItems.service;

import java.util.List;
import java.util.Set;

import com.capgemini.assignmentItems.entity.Items;
import com.capgemini.assignmentItems.entity.Order;

public interface OrderService {
	
	public Order submitOrder(Order order);

	public Order updateOrder(Order order);

	public Order cancelOrder(int orderId);

	public Order deleteOrder(int orderId);

	public Order getOrder(int orderId);



	public List<Order> getOrders();

}
