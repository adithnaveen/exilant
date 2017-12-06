package com.exilant.stratergy;

public class UPI implements PaymentStratergy{
	
	private String mobileNumber; 
	private int otp;
	private static double charges = 3.3;

	
	public UPI(String mobileNumber, int otp) {
		super();
		this.mobileNumber = mobileNumber;
		this.otp = otp;
	}
	
	public UPI(){}

	public static double getCharges() {
		return charges;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid using UPI, Mobile Number " + mobileNumber);
	}
	
}
