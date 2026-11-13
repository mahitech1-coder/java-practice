package com.oops.abstraction;

public class DebitCard implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("paid ₹" + amount + "using debit card");

	}

}
