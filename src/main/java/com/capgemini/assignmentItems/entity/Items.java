package com.capgemini.assignmentItems.entity;

import java.io.Serializable;
import java.util.Objects;


public class Items implements Serializable{
	private int itemId;
	private int quantity;
	private int productId;
	public Items() {
		super();
	}
	public Items(int itemId, int quantity, int productId) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.productId = productId;
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
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", quantity=" + quantity + ", productId=" + productId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(itemId, productId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (itemId != other.itemId)
			return false;
		if (productId != other.productId)
			return false;
		return true;
	}
	

}
