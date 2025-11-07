package com.kodewala.spring;

public class Order {
	
    private String itemName;
	
	private int orderId;
	
	private String orderStatus;

	public String getItemName() {
		return itemName;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
