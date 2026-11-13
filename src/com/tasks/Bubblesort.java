package com.tasks;

public class Bubblesort {

	public static void main(String[] args) {

		int[] numbers = { 30, 20, 10, 60, 15, 55, 59 };
		
		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;

				}

			}

		}

		System.out.println("after sorting:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
