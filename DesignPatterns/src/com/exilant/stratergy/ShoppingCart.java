package com.exilant.stratergy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items;
	BestPrice bestPrice; 
	
	// you begin shopping 
	public ShoppingCart(){
		items = new ArrayList<Item>();
	}
	
	// add item to cart 
	public void addItem(Item item){
		this.items.add(item);
	}
	
	// remove item from cart 
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	// amout to be paid 
	public int calculateTotal(PaymentStratergy paymentStratergy ){
		int sum =0; 
		for(Item item : items){
			sum += item.getPrice() * item.getCount();
		}

		if(paymentStratergy instanceof CreditCard){
			double charges = (CreditCard.getCharges() * sum ) /100;
			System.out.println("Payment Charges " + charges);
			sum += charges;
		}else if(paymentStratergy instanceof UPI){
			double charges = (UPI.getCharges() * sum ) /100;
			System.out.println("Payment Charges " + charges);
			sum += charges;
		}

		return sum; 
	}
	
	// we can ask user how s(he) want to pay 
	public void checkout(){
		PaymentStratergy paymentStratergy = new BestPrice().bestPay();
//		paymentStratergy.pay(calculateTotal( paymentStratergy));
		paymentStratergy.pay(this.calculateTotal(paymentStratergy));
	}
	
}















