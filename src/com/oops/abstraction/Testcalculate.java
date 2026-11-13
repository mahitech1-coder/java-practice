package com.oops.abstraction;

public class Testcalculate {

	public static void main(String[] args) {
		Calculator addition=(a,b)->a+b;
		 Calculator subraction=(a,b)->a-b;;
		 Calculator multiplication=(a,b)->a*b;
		
		 System.out.println("addition is:"+addition.calculate(10, 5));
		System.out.println("subtraction is:"+subraction.calculate(10, 5));
		System.out.println("multiplication  is:"+multiplication.calculate(10, 5));

	}

}
