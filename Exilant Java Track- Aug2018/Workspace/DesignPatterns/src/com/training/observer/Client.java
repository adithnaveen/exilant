package com.training.observer;

public class Client {
	public static void main(String[] args) {
		IObservable observable = new OnePlust6T(); 
		
		IObserver user1 = new User(observable, "Kumar"); 
		IObserver user2 = new User(observable, "Anuj"); 
		IObserver user3 = new User(observable, "Deepak"); 
		IObserver user4 = new User(observable, "Krishna"); 
		

		observable.addUser(user1);
		observable.addUser(user2);
		observable.addUser(user3);
		observable.addUser(user4);
		
		((OnePlust6T)observable).setArrived(true);
		
	}
}
