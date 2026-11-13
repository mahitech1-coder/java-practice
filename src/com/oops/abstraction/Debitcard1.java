package com.oops.abstraction;

public class Debitcard1 implements Payment1 {

	@Override
	public void pay(double amount) {
		System.out.println("paid ₹" +amount +"using debit card");
		
	}

}
