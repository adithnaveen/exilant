package com.training.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.aop.service.BankingSerivce;

public class AopClient {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("aop-context.xml"); 
		
		BankingSerivce bankingService = (BankingSerivce) context.getBean("banking"); 
	
		System.out.println(bankingService.getSbAccount().
				getAcc().getBalance());
	
		System.out.println(bankingService.getCaAccount().
				showBalance());
		
		bankingService.getCaAccount().
				getOneParameter(100); 
		
		String retVal = bankingService.setAndGet("Harry");
		System.out.println("Return Val in Main " + retVal);
		
		bankingService.throwSomeException(); 
	}
}





