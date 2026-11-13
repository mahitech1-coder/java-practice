package com.oops.abstraction;

public class ParttimeEmployee extends Employee {
	int hourly_works;
	double hourly_rate;

	ParttimeEmployee(int empid, String empname, int hw, double hr) {
		super(empid, empname);
		this.hourly_works = hw;
		this.hourly_rate = hr;

	}

	@Override
	double calculatesalary() {

		return hourly_works * hourly_rate;
	}

}
