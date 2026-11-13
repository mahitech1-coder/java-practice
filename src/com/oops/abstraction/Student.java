package com.oops.abstraction;

public class Student extends Person {

	String course;

	Student(String name, int age, String course) {
		super(name, age);

		this.course = course;

	}

	@Override
	void displayrole() {
		System.out.println("course:" + course);

		System.out.println("role:Student");

	}

}
