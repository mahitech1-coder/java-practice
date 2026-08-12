package com.operators;

import java.util.Scanner;

public class Teststudentmarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total;
		int avg;
		System.out.println("enter the marks of first subject");
		int m1 = sc.nextInt();
		System.out.println("enter the marks of second subject");
		int m2 = sc.nextInt();
		System.out.println("enter the marks of third subject");
		int m3 = sc.nextInt();
		System.out.println("enter the marks of fourth subject");
		int m4 = sc.nextInt();
		System.out.println("enter the marks of fifth subject");
		int m5 = sc.nextInt();
		total = m1 + m2 + m3 + m4 + m5;
		System.out.println("the total marks is:" + total);
		avg = total/5;
		System.out.println("the avg marks is:" + avg);

	}

}
