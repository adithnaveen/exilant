package com.exilant.lambda;

public class WorkerInterfaceTest {
	public static void main(String[] args) {
		Runner runner = new Runner();
		
		runner.execute(new WorkerInterface() {
			
			@Override
			public void doSomeWork() {
				System.out.println("Worker invoked in Ananymous Class");
			}
		});
		
		runner.execute(() -> System.out.println("in lambda way"));
		
		
		System.out.println("---------------------------");
		
		runner.execute(() -> {
			System.out.println("in lamba way, multiple lines");
			System.out.println("You can have any work going here");
		});
		
	}
}
