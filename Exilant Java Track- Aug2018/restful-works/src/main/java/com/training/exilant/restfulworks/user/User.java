package com.training.exilant.restfulworks.user;

import java.util.Date;

public class User {
	private Integer userId; 
	private String name; 
	private Date brithDate;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBrithDate() {
		return brithDate;
	}
	public void setBrithDate(Date brithDate) {
		this.brithDate = brithDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", brithDate=" + brithDate + "]";
	}
	public User() {}
	public User(Integer userId, String name, Date brithDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.brithDate = brithDate;
	} 
	
	
}
