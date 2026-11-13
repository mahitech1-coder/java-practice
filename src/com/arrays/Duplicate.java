package com.arrays;

public class Duplicate {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 10, 30, 20, 40, 30 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}

			}

		}

	}

}
