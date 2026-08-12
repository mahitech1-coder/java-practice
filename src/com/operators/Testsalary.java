package com.operators;

import java.util.Scanner;

public class Testsalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee salary");
		double salary = sc.nextDouble();
		System.out.println("enter the updated salary");
		double usalary = sc.nextDouble();
		salary += usalary;
		System.out.println("the  salary is:" + salary);
	}

}
