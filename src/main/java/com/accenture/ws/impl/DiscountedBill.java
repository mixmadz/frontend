package com.accenture.ws.impl;

import com.accenture.ws.entity.CafeClerk;
import com.accenture.ws.entity.OrderBill;

public class DiscountedBill extends OrderBill{

	public DiscountedBill(CafeClerk clerk) {
		super(clerk);
		
	}
	
//	public double getTotalBill() {
//		return 0;
//	}

}
