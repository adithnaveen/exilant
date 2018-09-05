package com.training.exilant.restfulworks.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	// we are simulating the DB 
	// it is kept in the list 
	
	private static List<User> users = new ArrayList<>(); 
	private static int usersCount = 103; 
	
	static {
		users.add(new User(101, "Rupa Jain", new Date()));  
		users.add(new User(102, "Akshay Maduvinakodi", new Date())); 
		users.add(new User(103, "Ankit Kumar", new Date()));
		
	}
	
	public List<User> getAllUsers(){
		return users; 
	}
	
	public User saveUser(User user) {
		if(user.getUserId() == null) {
			user.setUserId(++usersCount);
		}
		
		users.add(user); 
		return user; 
	}
	
	public User getUser(int userId) {
		for(User user : users) {
			if(user.getUserId() == userId) {
				return user; 
			}
		}
		return null; 
	}
	
	public User deleteUser(int userId) {
		return null; 
		// TODO 
	}
	
	public User updateUser(User user) {
		/// TODO 
		return null;
	}
	
	
	
	
	
}
