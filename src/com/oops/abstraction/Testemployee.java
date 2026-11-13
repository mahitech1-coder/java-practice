package com.oops.abstraction;

public class Testemployee {

	public static void main(String[] args) {
		Employee e = new Fulltimeemployee(101, "mahesh", 30000);
		e.displayEmployee();
		System.out.println("salary:" + e.calculatesalary());
		System.out.println("*******************");
		Employee e1 = new ParttimeEmployee(102, "ravi", 600, 20);
		e1.displayEmployee();
		System.out.println("salary:" + e1.calculatesalary());

	}

}
