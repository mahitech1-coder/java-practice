package com.oops.abstraction;

public class Testdemo3 {

	public static void main(String[] args) {
		Shape s = new Circe(5);
		System.out.println("the circle area is:" + s.area());
		Shape s1 = new Recatngle(10, 5);
		System.out.println("the rectangle area is:" + s1.area());

		Shape s2 = new Triangle(8, 6);
		System.out.println("the triangle  area is:" + s2.area());

	}

}
