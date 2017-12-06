package com.exilant.composite;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int custId;
	private String custName;
	
	private List<Customer> reference;
	
	public Customer(int custId, String custName){
		this.custId  = custId;
		this.custName = custName;
		this.reference = new  ArrayList<Customer>();
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	
	public void addReference(Customer customer){
		this.getReference().add(customer);
	}
	
	public void removeReference(Customer customer){
		this.getReference().remove(customer);
	}

	public List<Customer> getReference() {
		return reference;
	}
}



