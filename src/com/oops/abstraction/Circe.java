package com.oops.abstraction;

public class Circe extends Shape {
	int radius;

	Circe(int radius) {
		this.radius = radius;
		

	}

	@Override
	double area() {
		

		return Math.PI * radius * radius;
	}

}
