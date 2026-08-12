package com.loops;
//Count how many even numbers are present between 1 and 100.

public class Demo6 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i = i + 2) {
			count++;

		}
		System.out.println("the even numbers are:" + count);
	}

}
