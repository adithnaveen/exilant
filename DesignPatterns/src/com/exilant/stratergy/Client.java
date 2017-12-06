package com.exilant.stratergy;

public class Client {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Item("Mobile", 2000, 2));
		cart.addItem(new Item("Monitor", 4000, 1));
		cart.addItem(new Item("Marker", 30, 5));
		
		// for credit card 
		// String name, String cardNumber, int cvv, String dateOfExpiry
		// for UPI 
		// String mobileNumber, int otp
		
		
		cart.checkout();
		System.out.println("--------------------------------------------------");
	}
}
