package com.oops.abstraction;

public interface Logger {
	default void log() {
		System.out.println("notification logged");
	}

}
