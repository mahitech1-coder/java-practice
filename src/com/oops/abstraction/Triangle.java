package com.oops.abstraction;

public class Triangle extends Shape {
	int base;
	int height;

	Triangle(int base, int height) {
		this.base = base;
		this.height = height;
		
	}

	@Override
	double area() {

		return 0.5 * base * height;
	}

}
