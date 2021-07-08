package com.accenture.ws.entity;

import java.util.List;

public class OrderBill {
	
	private List<OrderClass> orderList;
	private CafeClerk clerk;
	
	
	public OrderBill(CafeClerk clerk) {
		super();
		this.clerk = clerk;
	}


	public List<OrderClass> getOrderList() {
		return orderList;
	}


	public void setOrderList(List<OrderClass> orderList) {
		this.orderList = orderList;
	}


	public CafeClerk getClerk() {
		return clerk;
	}


//	public double getTotalBill() {
//		return 0;
//		
//	}
//	
	

}
