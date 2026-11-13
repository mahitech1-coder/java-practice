package com.oops.abstraction;

public class Testpayment {

	public static void main(String[] args) {
		Payment p = new UPI();
		p.pay(500);
		Payment p1 = new CreditCard();
		p1.pay(1000);
		Payment p2 = new DebitCard();
		p2.pay(2000);

	}

}
