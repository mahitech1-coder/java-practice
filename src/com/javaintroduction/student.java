package com.javaintroduction;
public class Student {
	String name;
	int id;
	float marks;
	void show() {
		
	}

	public static void main(String[] args) { 
		System.out.println("main method started");
		Student s=new Student();
		
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("marks:"+marks);
		System.out.println("main method ended");

	}

}
