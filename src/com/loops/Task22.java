package com.loops;

public class Task22 {

	public static void main(String[] args) {
		String name = "programming";
		String result = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (result.indexOf(ch) == -1) {
				result = result + ch;

			}

		}
		System.out.println("original name is:" + name);
		System.out.println("after removing duplicates:" + result);

	}

}
