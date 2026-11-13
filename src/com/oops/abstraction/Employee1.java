package com.oops.abstraction;

public abstract class Employee1 {
	int empid;
	String empname;
	double salary;

	Employee1(int empid, String empname, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	void display() {
		System.out.println("empid:" + empid);
		System.out.println("empname:" + empname);
		System.out.println("salary:" + salary);
	}
	abstract double calculatesalary();
}
