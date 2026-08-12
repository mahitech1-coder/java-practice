package com.operators;

import java.util.Scanner;

public class Testupdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total;
		double avg;
		double percentage;
		System.out.println("enter the telgu marks");
		int marks1 = sc.nextInt();
		System.out.println("enter english marks");
		int marks2 = sc.nextInt();
		System.out.println("enter the maths marks");
		int marks3 = sc.nextInt();
		System.out.println("enter the science marks");
		int marks4 = sc.nextInt();
		System.out.println("enter the social marks");
		int marks5 = sc.nextInt();
		total = marks1 + marks2 + marks3 + marks4 + marks5;
		System.out.println("the total marks is:" + total);
		avg = total / 5;
		System.out.println("the avg is:" + avg);
		percentage = (total / 500.0) * 100;
		System.out.println("the percentage is:" + percentage);

	}

}
