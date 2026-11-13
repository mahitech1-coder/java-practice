package com.oops.abstraction;

public abstract class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	abstract void displayrole();

	void displaydetails() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);

	}

}
