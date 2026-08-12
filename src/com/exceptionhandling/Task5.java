package com.exceptionhandling;

public class Task5 {

	public static void main(String[] args){
		int age = 16;
		if (age < 18) {
			throw new ArithmeticException("not eligible to vote ");
		}
		System.out.println("eligible for vote");
	}

}
