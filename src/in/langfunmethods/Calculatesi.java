package in.langfunmethods;

import java.util.Scanner;

public class Calculatesi {
	static double findSi(double principle, double rate, double time) {
		double si = (principle * rate * time) / 100;
		return si;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle amount:");
		double p = sc.nextDouble();
		System.out.println("enter the rate:");
		double r = sc.nextDouble();
		System.out.println("enter the time");
		double t = sc.nextDouble();
		System.out.println("The simple interest is:" + findSi(p, r, t));
		System.out.println("main method ended");

	}

}
