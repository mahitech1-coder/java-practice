package com.oops.abstraction;

public class Testdisplay {

	public static void main(String[] args) {
		Payment1 p = new UPI1();
		p.pay(500);
		p.show();
		p = new Creditcard1();
		p.pay(1000);
		p.show();
		p = new Debitcard1();
		p.pay(2000);
		p.show();

	}

}
