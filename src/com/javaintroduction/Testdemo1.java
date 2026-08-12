package com.javaintroduction;

public class Testdemo1 {

	public static void main(String[] args)    throws ClassNotFoundException{
		System.out.println("main method started");
		Class.forName("com.javaintroduction.student");
		System.out.println("student class loaded ");
		System.out.println("main method ended");

	}

}
