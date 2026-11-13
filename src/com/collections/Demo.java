package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);

		System.out.println(numbers);
		System.out.println("***************");
		System.out.println(numbers.set(1, 15));
		System.out.println(numbers.remove(2));
		System.out.println(numbers.contains(40));
		System.out.println(numbers.size());
		System.out.println(numbers);

	}

}
