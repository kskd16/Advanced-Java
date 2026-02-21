package com.example;

public class Order {
	int orderId;
	String customerName;
	String category;
	double amount;
	String city;
	String status;
	
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", category=" + category + ", amount="
				+ amount + ", city=" + city + ", status=" + status + "]";
	}


	public Order() {}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order(int orderId, String customerName, String category, double amount, String city, String status) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.category = category;
		this.amount = amount;
		this.city = city;
		this.status = status;
	}
	
	

}
