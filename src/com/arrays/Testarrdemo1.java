package com.arrays;

public class Testarrdemo1 {

	public static void main(String[] args) {
//		declaration
		int[] ages;
//		creation
		ages = new int[10];
//		Initialization
		ages[0] = 20;
		ages[1] = 21;
		ages[2] = 22;
		ages[3] = 23;
		ages[4] = 24;
		ages[5] = 25;
		ages[6] = 26;
		ages[7] = 27;
		ages[8] = 28;
		ages[9] = 29;
//		Representation
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
//		System.out.println(ages[4]);
//		System.out.println(ages[5]);
//		System.out.println(ages[6]);
//		System.out.println(ages[7]);
//		System.out.println(ages[8]);
//		System.out.println(ages[9]);
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		System.out.println("**********************");
//		Representing the array by using byte data type
		byte[] numbers;
		numbers = new byte[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("***************************");
//		Representing the array by using short data type
		short[] digits;
		digits = new short[5];
		digits[0] = 10;
		digits[1] = 20;
		digits[2] = 30;
		digits[3] = 40;
		digits[4] = 50;
		for (int i = 0; i < digits.length; i++) {
			System.out.println(digits[i]);
		}
		System.out.println("*********************");
//		Representing the array by using float data type
		float[] decimal;
		decimal = new float[5];
		decimal[0] = 10.5f;
		decimal[1] = 20.2f;
		decimal[2] = 30.3f;
		decimal[3] = 40.6f;
		decimal[4] = 50.7f;
		for (int i = 0; i < decimal.length; i++) {
			System.out.println(decimal[i]);
		
		}
		System.out.println("***********************");
//		Representing the array by using char data type
		char[] letters;
		letters = new char[6];
		letters[0] = 'M';
		letters[1] = 'A';
		letters[2] = 'H';
		letters[3] = 'E';
		letters[4] = 'S';
		letters[5] = 'H';
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
		System.out.println("*******************");

//		Representing the array by using string data type
		String[] names;
		names = new String[5];
		names[0] = "MAHESH";
		names[1] = "RAJU";
		names[2] = "PAVAN";
		names[3] = "GOPI";
		names[4] = "KARTHIK";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
