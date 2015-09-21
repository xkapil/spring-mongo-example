package com.kapil.learn.model;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "cust")
public class Order {

	private long id;
	private BigDecimal amount;
	private String product;
	private long customerId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

}
