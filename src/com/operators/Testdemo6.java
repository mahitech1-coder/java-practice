package com.operators;

public class Testdemo6 {

	public static void main(String[] args) {
		System.out.println("swap of two numbers");
		int a = 15;
		int b = 25;
		System.out.println("Before swapping");
		System.out.println("a is:" + a);
		System.out.println("b is:" + b);
		a = a + b;// 40
		b = a - b;// 15
		a = a - b;// 25
		System.out.println("After swapping");
		System.out.println("a is:" + a);
		System.out.println("b is:" + b);

	}

}
