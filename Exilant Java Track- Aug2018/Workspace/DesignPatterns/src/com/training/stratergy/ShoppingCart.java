package com.training.stratergy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items; 
	
	protected List<Item> getItems() {
		return items;
	}

	public ShoppingCart() {
		this.items = new ArrayList<Item>(); 
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	// you can also do modify TODO
	public void modifyItemCount(Item item) {}
	
	public int calculateTotal() {
		int sum = 0 ;
		
		for(Item item : items) {
			sum = sum + item.getPrice() * item.getQty(); 
		}
		return sum; 
	}
	
	public void checkOut(Payment paymentStratergy) {
		paymentStratergy.pay(calculateTotal());
	}
	
	
	
}









