package com.training.aop.model;

public class CAAccount {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	} 
	
	public double showBalance() {
		this.getTest(); 
		return account.getBalance();
	}

	void getTest() {
		System.out.println("This is default test... ");
	}

	public void getOneParameter(int x) {
		System.out.println("you called with x" + x );
	}
}








