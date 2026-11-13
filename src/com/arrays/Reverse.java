package com.arrays;

public class Reverse {
	public static void main(String[] args) {
		String s1 = "hello";
		String res = "";
		for (int i = 4; i >= 0; i--) {
			s1.charAt(i);
			res += s1.charAt(i);
		}
		System.out.println(res);

	}

}
