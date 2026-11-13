package com.oops.abstraction;

public class Testdemo4 {

	public static void main(String[] args) {
		Bank b = new Sbi();
		b.interestrate();
		Bank b1 = new Hdfc();
		b1.interestrate();
		Bank b2 = new Icici();
		b2.interestrate();

	}

}
