package com.exilant.stratergy;

public class CreditCard implements PaymentStratergy {

	private String name; 
	private String cardNumber; 
	private int cvv; 
	private String dateOfExpiry;
	private static double charges=5.3; 
	
	public static double getCharges() {
		return charges;
	}

	public CreditCard(){}
	public CreditCard(String name, String cardNumber, int cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	
	
	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid with Credit Card Number " + this.cardNumber);
	}

}
