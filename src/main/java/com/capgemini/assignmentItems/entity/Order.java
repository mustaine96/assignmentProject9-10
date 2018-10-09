package com.capgemini.assignmentItems.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="orderTable")
public class Order implements Serializable{
	@Id
	int orderId;
	double orderTotalAmount;
	LocalDate orderDate;
	@OneToMany(mappedBy="order")
	List<Items> itemsInOrder;
	
	public Order() {
		super();
	}
	public Order(int orderId, double orderTotalAmount, LocalDate orderDate, List<Items> itemsInOrder) {
		super();
		this.orderId = orderId;
		this.orderTotalAmount = orderTotalAmount;
		this.orderDate = orderDate;
		this.itemsInOrder = itemsInOrder;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderTotalAmount() {
		return orderTotalAmount;
	}
	public void setOrderTotalAmount(double orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public List<Items> getItemsInOrder() {
		return itemsInOrder;
	}
	public void setItemsInOrder(List<Items> itemsInOrder) {
		this.itemsInOrder = itemsInOrder;
	}
	
}
