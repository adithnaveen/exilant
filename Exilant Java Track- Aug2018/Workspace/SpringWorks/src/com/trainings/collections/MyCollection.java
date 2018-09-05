package com.trainings.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollection {
	private List questionBank; 
	private Set addressSet; 
	private AccountMap accountMap;
	
	public List getQuestionBank() {
		return questionBank;
	}
	public void setQuestionBank(List questionBank) {
		this.questionBank = questionBank;
	}
	public Set getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public AccountMap getAccountMap() {
		return accountMap;
	}
	public void setAccountMap(AccountMap accountMap) {
		this.accountMap = accountMap;
	}
	@Override
	public String toString() {
		return "MyCollection [questionBank=" + questionBank + ", addressSet=" + addressSet + ", accountMap="
				+ accountMap + "]";
	}


	
}
