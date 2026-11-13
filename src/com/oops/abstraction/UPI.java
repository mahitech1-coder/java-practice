package com.oops.abstraction;

public class UPI implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("paid ₹" +amount + "using upi");
		
	}

}
