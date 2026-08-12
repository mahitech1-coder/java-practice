package com.arrays;

import java.util.Scanner;

public class Testdemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter" + n + "elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("the array of elements are");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

}
