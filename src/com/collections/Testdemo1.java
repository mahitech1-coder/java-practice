package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Testdemo1 {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		num.add(1,15);
		num.remove(Integer.valueOf(30));
		num.set(3, 100);
		System.out.println(num);
		System.out.println(num.contains(50));

	}
}