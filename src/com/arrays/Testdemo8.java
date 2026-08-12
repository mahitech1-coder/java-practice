package com.arrays;

public class Testdemo8 {

	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int[] arr = { 10, 20, 30, 40, 50 };
		for (int a : arr) {
			sum = sum + a;
			avg=sum/a;
		}
		
		System.out.println("the sum is:" + sum);
		System.out.println("the avg is:" + avg);

	}

}
