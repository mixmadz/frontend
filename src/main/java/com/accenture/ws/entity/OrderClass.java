package com.accenture.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
public class OrderClass implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false )
	private Long id;
	private String orderName;
	private double price;
	private double originalPrice;
	private Boolean isDiscounted;
	private double isDiscountPercentage = 0.5;
	private String type;
	
	
	public OrderClass() {}


	public OrderClass(Long id, String orderName, double price, double originalPrice, Boolean isDiscounted,
			double isDiscountPercentage, String type) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.price = price;
		this.originalPrice = originalPrice;
		this.isDiscounted = isDiscounted;
		this.isDiscountPercentage = isDiscountPercentage;
		this.type = type;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getOrderName() {
		return orderName;
	}


	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getOriginalPrice() {
		return originalPrice;
	}


	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}


	public Boolean getIsDiscounted() {
		return isDiscounted;
	}


	public void setIsDiscounted(Boolean isDiscounted) {
		this.isDiscounted = isDiscounted;
	}


	public double getIsDiscountPercentage() {
		return isDiscountPercentage;
	}


	public void setIsDiscountPercentage(double isDiscountPercentage) {
		this.isDiscountPercentage = isDiscountPercentage;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	

	
	
	
	
	
	
		
	
	
	
	
	
	

}