package com.capgemini.assignmentItems.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="itemsTable")
public class Items implements Serializable{
	@Id
	int itemId;
	int quantity;
	int productPrice;
	int productId;
	@ManyToOne
	@JoinColumn(name="orderId")
	Order order;
	public Items(int itemId, int quantity, int productPrice, int productId, Order order) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.productPrice = productPrice;
		this.productId = productId;
		this.order = order;
	}
	
	public Items() {
		super();
	}

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	

}
