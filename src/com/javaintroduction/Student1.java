package com.javaintroduction;

public class Student1 {
	String studentname="RAJU";
	int age=30;
	static String state="ANDHRA PRADESH";
	static int totalstudents=80;

          public static void main(String[] args) {
		System.out.println("STUDENT INFORMATION");
		System.out.println("*****STUDENT 1 INFORMATION***");
		System.out.println("state is:"+state);
		System.out.println("total students is:"+totalstudents);
		Student1 std1=new Student1();
		std1.studentname="MAHESH";
		std1.age=22;
		System.out.println("student name is:"+ std1.studentname);
		System.out.println("student age is:"+std1.age);
		
		System.out.println("*****STUDENT 2 INFORMATION***");
		state="NARASARAOPET";
		totalstudents=100;
		System.out.println("state is:"+state);
		System.out.println("total students is:"+totalstudents);
		Student1 std2=new Student1();
		std2.studentname="MAHI";
		std2.age=26;
		System.out.println("student name is:"+ std2.studentname);
		System.out.println("student age is:"+std2.age);
	}
}
