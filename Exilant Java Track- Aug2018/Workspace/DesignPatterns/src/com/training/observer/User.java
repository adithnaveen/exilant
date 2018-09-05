package com.training.observer;


public class User  implements IObserver{

	private IObservable observable = null; 
	private String name; 
	
	// the constructor is a mapper between 
	// the enduser and the notifcation(product) 
	public User(IObservable obervable, String name) {
		this.observable = obervable; 
		this.name = name; 
	}
	
	public void buyMobile() {
		System.out.println("Hurry, i've bought OnePlut6T, by " + name);
	}
	
	
	@Override
	public void update() {
		// TODO, remove the observer from OnePlut6T 
		buyMobile(); 
	}

	public void unSubscribe() {
		observable.remove(this);
	}
	
	
}
