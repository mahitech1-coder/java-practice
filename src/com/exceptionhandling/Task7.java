package com.exceptionhandling;

public class Task7 {

	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("name cannot be null");
		}
		System.out.println("program continues");
	}

}
