package com.exilant.day2;

// all business logics go here 
public class Runner {
	public void execute(WorkerInterface workerInterface) {
		System.out.println("In Execute Method... ");
		workerInterface.doSomeWork(); 
		
	}
	
	
	public String comapre(String s1, String s2, LargestString ls) {
		return ls.accept(s1, s2); 
	}
}
