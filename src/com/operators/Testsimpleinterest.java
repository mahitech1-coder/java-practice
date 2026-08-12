package com.operators;

import java.util.Scanner;

public class Testsimpleinterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double si;
		System.out.println("enter the principal amount");
		double principle = sc.nextDouble();
		System.out.println("enter the rate of interest");
		double rate = sc.nextDouble();
		System.out.println("enter the time of interest");
		double time = sc.nextInt();
		si = ((principle * rate * time) / 100);
		System.out.println("the simple interest is:" + si);
	}

}
