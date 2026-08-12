package com.logicaloperators;

public class Testdemo1 {
	public static void main(String args[]) {

		int a = 5;
		int b = 10;
		int c = 4;
//		int d=(a>b)?a:b;
//		System.out.println(d);
//		int e=(a>c)?a:c;
//		System.out.println(e);
//		int f=(b>c)?b:c;
//		System.out.println(f);
//		int g=(c>b)?c:b;
//		System.out.println("greatest number is:"+g);
		int greatestNumber = (a > b) ? (a > c ? a : c) : ((b > c) ? b : c);
		int num = 0;
		String result=(num%2==0)?"even":"odd";
		System.out.println("result is:"+result);
	}

}
