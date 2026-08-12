package com.inheritance;

public class Person {
	String name;
	int age;
	void displayDetails(String name,int age) {
		this.name=name;
		this.age=age;
	}

	static class Student extends Person{
		int rollno;
	
	void displayStudentinfo(String name,int age,int rollno) {
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	

	public static void main(String[] args) {
		Person p=new Person();
		Person.Student s1=p.new Student();
		
	}
	





