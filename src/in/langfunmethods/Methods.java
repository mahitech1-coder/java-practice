package in.langfunmethods;

import java.util.Scanner;

public class Methods {
	static Scanner sc = new Scanner(System.in);

	static double area(int a) {
		int a1=a;
		System.out.println("area is:"+a1);
		return 3.14*a1*a1;
	}

	static double volume(int b) {
		int b1 = b;
		System.out.println("volume is:" + b1);
		return 4 / 3 * 3.14 * b1 * b1 * b1;
	}

	static double perimeter(int c) {
		int c1 =c;
		System.out.println("perimeter is:" + c1);
		return 2 * 3.14 * c1;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		int  x=sc.nextInt();
		double x1=area(x);
		System.out.println("area value is:"+x1);
		int y=sc.nextInt();
		double x2=volume(y);
		System.out.println("volume value is:"+x2);
		int z=sc.nextInt();
		double x3=perimeter(z);
		System.out.println("perimeter value is:"+x3);
		
	}

}
