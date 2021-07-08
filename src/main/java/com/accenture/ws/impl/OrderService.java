package com.accenture.ws.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.ws.entity.OrderClass;
import com.accenture.ws.repository.OrderRepo;
@Service
public class OrderService {
	
	private final OrderRepo orderRepo;

	public OrderService(OrderRepo orderRepo) {
		this.orderRepo = orderRepo;
	}
	
	public List<OrderClass> findAllOrders() {
		return orderRepo.findAll();
	}
	
	public OrderClass addOrder( OrderClass orderClass) {
		return orderRepo.save(orderClass);
	}
	
	
	
	public void deleteOrder(Long id) {
		orderRepo.deleteById(id);
		
	}
	
	public OrderClass findSingleOrder(Long id) {
		return orderRepo.findOrderById(id);
	}
	// if true set price to discount
	//if false set price to original
	public OrderClass updateOrder(Long id,OrderClass orderClass){
		OrderClass existingOrder = orderRepo.findOrderById(id);
		if (existingOrder.getIsDiscounted() == false) { // ano status nong nahanap ko 
			if (orderClass.getIsDiscounted() == false) {
				existingOrder.setPrice(existingOrder.getOriginalPrice());
				return orderRepo.save(existingOrder);
			}else {
				existingOrder.setIsDiscounted(orderClass.getIsDiscounted());
				existingOrder.setPrice(existingOrder.getOriginalPrice()*existingOrder.getIsDiscountPercentage());
				return orderRepo.save(existingOrder);
			}
//			existingOrder.setIsDiscounted(orderClass.getIsDiscounted());
//			existingOrder.setPrice(existingOrder.getOriginalPrice()*existingOrder.getIsDiscountPercentage());
			 // result nito ay true at may discount 
		}
		// true dati
		if (existingOrder.getIsDiscounted() == true) {
			if (orderClass.getIsDiscounted() == true) {
			existingOrder.setPrice(existingOrder.getOriginalPrice()*existingOrder.getIsDiscountPercentage());
			}else {
				existingOrder.setIsDiscounted(orderClass.getIsDiscounted());
				existingOrder.setPrice(existingOrder.getOriginalPrice());
				return orderRepo.save(existingOrder);
			}
		}
		
		return orderRepo.save(existingOrder);
			
		
			
		
		
	}
	
}