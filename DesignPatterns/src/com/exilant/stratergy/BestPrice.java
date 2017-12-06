package com.exilant.stratergy;

public class BestPrice {
	public PaymentStratergy bestPay(String ... args){
		
		return CreditCard.getCharges() < UPI.getCharges()? 
				new CreditCard(args[0], args[1], Integer.parseInt(args[2]), args[3]):
					new UPI(args[0],  Integer.parseInt(args[1]));
				
	}
	
public PaymentStratergy bestPay( ){
		
		return CreditCard.getCharges() < UPI.getCharges()? 
				new CreditCard():
					new UPI();
				
	}
}
