package com.training.observer;

import java.util.ArrayList;
import java.util.List;


public class OnePlust6T implements IObservable {

	private List<IObserver> users; 
	private boolean isArrived = true; 
	
	public OnePlust6T() {
		users = new ArrayList<IObserver>();
	}
	
	@Override
	public void addUser(IObserver observer) {
		users.add(observer); 
	}

	@Override
	public void remove(IObserver observer) {
		users.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// to notify all users 
		for(IObserver temp : users) {
			temp.update(); 
		}
	}
	
	public boolean isArrived() {
		return isArrived; 
	}
	
	public void setArrived(boolean isArrived) {
		this.isArrived = isArrived; 
		notifyObserver(); 
	}

}
