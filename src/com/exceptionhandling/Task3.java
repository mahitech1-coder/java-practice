package com.exceptionhandling;

public class Task3 {

	public static void main(String[] args) {
		String str = "abc";
		try {
			int number = Integer.parseInt(str);
			System.out.println(number);
		} catch (NumberFormatException e) {
			System.out.println("string cannot convert to integer");
		}
		System.out.println("program continues");
	}

}
