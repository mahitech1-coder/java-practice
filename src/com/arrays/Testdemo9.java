package com.arrays;

public class Testdemo9 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 40, 30 };
		int min =0;
		for (int i = 0; i < arr.length; i++) {
		if (arr[i]>min) {
			min = arr[i];
		}
			System.out.println("the minimum value is:" + min);
		}

	}
}


