package com.test;


public class Runner {
	public void execute(WorkerInterface worker){
		System.out.println("In Execute Method");
		worker.doSomeWork();
	}
	
	
	public void execute(Executable ex){
		System.out.println("In Execute - Executable");

		
		System.out.println("Val is " 
				+ ex.execute(10, 20));
	}
	
	public void execute1(Executable1 ex){
		System.out.println(ex.execute(10, 20));
	}
}
