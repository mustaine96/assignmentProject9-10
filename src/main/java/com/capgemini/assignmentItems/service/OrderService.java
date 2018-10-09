package com.capgemini.assignmentItems.service;

import com.capgemini.assignmentItems.entity.Order;

public interface OrderService {
	
	public Order getOrder(int orderId);
	public Order submitOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(int orderId);
	public void cancelOrder(int orderId);

}
