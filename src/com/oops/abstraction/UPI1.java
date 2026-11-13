package com.oops.abstraction;

public class UPI1 implements Payment1 {

	@Override
	public void pay(double amount) {
		System.out.println("paid ₹" +amount +"using upi");
		
		
		
	}

	public void show(){
		System.out.println("UPI RECEIPT GENERATED");
	}

}
