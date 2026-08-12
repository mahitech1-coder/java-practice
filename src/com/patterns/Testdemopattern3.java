package com.patterns;

//2. Rectangle (4 × 6)
//******
//******
//******
//******
public class Testdemopattern3 {

	public static void main(String[] args) {
		System.out.println("===================");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("=============");
//		3. Left Triangle
//		*
//		**
//		***
//		****
//		*****
		System.out.println("==============");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========-");
//		4. Inverted Left Triangle
//		*****
//		****
//		***
//		**
//		*
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
