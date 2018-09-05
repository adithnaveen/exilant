package com.training.observer;

// on which the observer is interested on 
public interface IObservable {
	public void addUser(IObserver observer); 
	public void remove(IObserver observer); 
	
	// all those people who are in the list 
	public void notifyObserver(); 
}
