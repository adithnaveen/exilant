package com.exilant.servicelocator;

public class OracleService implements Service{

	@Override
	public String getName() {
		return "Oracle Service";
	}

	@Override
	public void executeService() {
		System.out.println("Oracle Serivce loaing xml file...");
	}

}
