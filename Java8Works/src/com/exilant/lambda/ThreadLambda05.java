package com.exilant.lambda;

public class ThreadLambda05 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Anonymous Runnable Call... start ");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Anonymous Runnable Call...end ");
			}
		}).start();
		
		System.out.println("-----------------------------------");

		new Thread(() -> {
			System.out.println("hi i'm from lambda thread.... ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("i'm lambda end... ");
		} ).start();;
		
	}
}
