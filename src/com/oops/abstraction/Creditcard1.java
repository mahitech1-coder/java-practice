package com.oops.abstraction;

public class Creditcard1 implements Payment1 {

	@Override
	public void pay(double amount) {
	System.out.println("paid ₹" +amount +"using credit card");
		
	}

}
