package com.loops;

//Find the sum of even numbers from 1 to 100.
public class Demo4 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 100; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("sum of even numbers are:" + sum);
		System.out.println("*******************");
		int sum1 = 0;
		for (int i = 1; i <= 100; i = i + 2) {
			sum1 = sum1 + i;
		}
		System.out.println("sum of odd numbers are:" + sum1);
	}

}
