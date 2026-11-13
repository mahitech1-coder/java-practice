package com.oops.abstraction;

public class Fulltimeemployee extends Employee {
	int monthlysalary;

	Fulltimeemployee(int empid, String empname, int ms) {
		super(empid, empname);
		this.monthlysalary = ms;

	}

	@Override
	double calculatesalary() {

		return monthlysalary;

	}

}
