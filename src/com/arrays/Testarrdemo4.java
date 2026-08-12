package com.arrays;

public class Testarrdemo4 {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 7, 2, 8 };
		System.out.println("Before sorting array is:");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		System.out.println();
		System.out.println("After sorting array is:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
