package com.oops.abstraction;

public class Fulltimeemployee1 extends Employee1 implements Taxable {

	Fulltimeemployee1(int empid, String empname, double salary) {
		super(empid, empname, salary);

	}

	@Override
	double calculatesalary() {

		return salary;
	}

	
	public void calculateTax() {
		int tax;
		tax = (int) (salary * 10) / 100;
		System.out.println("tax is:" + tax);

	}

}
