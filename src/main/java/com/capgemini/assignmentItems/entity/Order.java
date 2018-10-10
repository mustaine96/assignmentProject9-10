package com.capgemini.assignmentItems.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
@Document(collection="orders")
public class Order implements Serializable{
	
	private int orderId;
	private double total;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	private long customerId;
	private String status;
	private Set<Items> items;
	public Order(int orderId, double total, LocalDate date, int customerId, String status, Set<Items> items) {
		super();
		this.orderId = orderId;
		this.total = total;
		this.date = date;
		this.customerId = customerId;
		this.status = status;
		this.items = items;
	}
	public Order() {
		super();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", total=" + total + ", date=" + date + ", customerId=" + customerId
				+ ", status=" + status + ", items=" + items + "]";
	}
	
	
	
}
