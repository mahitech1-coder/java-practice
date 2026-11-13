package com.oops.abstraction;

public abstract class Employee {
	int empid;
	String empname;
	Employee(int empid,String empname){
		this.empid=empid;
		this.empname=empname;
		
	}
	abstract double calculatesalary();
	void displayEmployee() {
		System.out.println("empid:"+empid);
		System.out.println("empname:"+empname);
	}

}
