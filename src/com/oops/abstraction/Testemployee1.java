package com.oops.abstraction;

public class Testemployee1 {

	public static void main(String[] args) {
		Employee1 e = new Fulltimeemployee1(101, "mahesh", 50000);

		e.display();

		System.out.println("Calculate Salary: " + e.calculatesalary());

		Taxable t = (Taxable) e;

		System.out.println("Tax: " + t.calculateTax());
		

	}

}
