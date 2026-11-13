package com.oops.abstraction;

public class Testperformance {

	public static void main(String[] args) {
		Performance Performance = (score) -> {
			if (score >= 90) {
				return "Excellent";
			} else if (score >= 75) {
				return "Good";
			} else if (score >= 50) {
				return "average";
			} else {
				return "poor";
			}

		};
		System.out.println("score:" +98);
		System.out.println(Performance.evaluate(98));

	}

}
