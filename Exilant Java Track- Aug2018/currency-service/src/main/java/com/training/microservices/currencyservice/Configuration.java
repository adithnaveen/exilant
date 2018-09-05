package com.training.microservices.currencyservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// prefix the vairables used in the application.properties 
@ConfigurationProperties("currency-service")
public class Configuration {
	private int inr; 
	private int usd;

	public Configuration() {}
	
	public Configuration(int inr, int usd) {
		super();
		this.inr = inr;
		this.usd = usd;
	}
	public int getInr() {
		return inr;
	}
	public void setInr(int inr) {
		this.inr = inr;
	}
	public int getUsd() {
		return usd;
	}
	public void setUsd(int usd) {
		this.usd = usd;
	} 
	
}
