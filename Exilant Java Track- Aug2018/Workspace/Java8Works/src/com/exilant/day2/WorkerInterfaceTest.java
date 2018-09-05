package com.exilant.day2;

public class WorkerInterfaceTest {
	public static void main(String[] args) {
		
		Runner runner = new Runner(); 
		
		runner.execute(new WorkerInterface() {
			
			@Override
			public void doSomeWork() {
				System.out.println("Hi we are doing some work in main");
			}
		});
		
		System.out.println("---------------------------------------------------");
		runner.execute(() -> System.out.println("Hi i'm in lamda way in main"));

		System.out.println("---------------------------------------------------");
		runner.execute(()-> {
			System.out.println("In lambda way, in multiple lines ");
			System.out.println("You can have any business logic here... ");
		} ); 
		
		
	}
}
