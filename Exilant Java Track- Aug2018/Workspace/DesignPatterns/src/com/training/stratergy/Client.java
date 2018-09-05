package com.training.stratergy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
	public static void main(String[] args) {
		List<Item> items = Stream.of(
				new Item("ITM101-Pen", 30, 4), 
				new Item("ITM102-Monitor", 4000, 2), 
				new Item("ITM103-Bottle", 65, 1)
				).collect(Collectors.toList()); 
		
		ShoppingCart shoppingCart = new ShoppingCart(); 
		
		shoppingCart.addItem(new Item("ITM101-Pen", 30, 4));
		shoppingCart.addItem(new Item("ITM102-Monitor", 4000, 2));
		shoppingCart.addItem(new Item("ITM103-Bottle", 65, 1));
		
		System.out.println("Total Amount " +shoppingCart.calculateTotal());
		Payment payemntStratergy = new 
				EWallet("adith.naveen@gmail.com", "secret@123", "paytm"); 
		System.out.println("checking out with ");
		for(Item item : shoppingCart.getItems()) {
			System.out.println("\t\tItem Code " + item.getItemCode() +
						" Price " + item.getPrice() +
						", Item Qty " + item.getQty());
		}
		shoppingCart.checkOut(payemntStratergy);
		
				
	}
}
