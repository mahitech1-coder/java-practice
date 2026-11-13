package com.tasks;

public class Student {
	int stid;
	String stname;
	String course;
	double fee;

	void display() {
		System.out.println(stid);
		System.out.println(stname);
		System.out.println(course);
		System.out.println(fee);
	}

	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.stid = 101;
		s1.stname = "mahesh";
		s1.course = "java";
		s1.fee = 25000.00;
		s1.display();
		System.out.println("****************");
		s2.stid = 102;
		s2.stname = "pardhu";
		s2.course = "testing";
		s2.fee = 18000.00;
		s2.display();
	}
}
