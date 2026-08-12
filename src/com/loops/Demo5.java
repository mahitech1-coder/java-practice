package com.loops;

//Find the sum of all numbers divisible by 3 between 1 and 100.
public class Demo5 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("the sum is divisible by 3:" + sum);
		System.out.println("*******************");

//Find the sum of all numbers divisible by 5 between 1 and 100.
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println("the sum is divisible by 5:" + sum1);
	}
}
