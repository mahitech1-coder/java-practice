package com.operators;

public class Testdemo5 {

	public static void main(String[] args) {
		System.out.println("swap of two numbers");
		int a = 10;
		int b = 20;
		System.out.println("before swapping");
		System.out.println(" a is:" + a);
		System.out.println("b is:" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping");
		System.out.println("a is:" + a);
		System.out.println("b is:" + b);
	}

}
