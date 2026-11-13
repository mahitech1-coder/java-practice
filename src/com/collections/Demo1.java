package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList();
		int sum = 0;
//		int largest = num.get(0);

		num.add(10);
		num.add(25);
		num.add(30);
		num.add(15);
		num.add(40);
		num.add(50);
		int smallest = num.get(0);
		int count = 0;
//		for (int n : num) {
//			if (n > 25) {
//				System.out.println(n);
//
//			}
//		}
//		for (int n : num) {
//			sum = sum + n;
//		}
//		System.out.println("sum is:" + sum);
		System.out.println("**********");
//		for (int n : num) {
//			if (n<smallest) {
//				smallest = n;
//			}
//		}
//		System.out.println("smallest is:" + smallest);
		System.out.println("*************");
		for (int n : num) {
			if (n % 2!= 0) {
				count++;

			}
		}
		System.out.println("count is:" + count);
	}

}
