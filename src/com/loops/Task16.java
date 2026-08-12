package com.loops;

//Print numbers divisible by both 2 and 5 from 1 to 50
public class Task16 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

}
