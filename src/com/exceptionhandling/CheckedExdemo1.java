package com.exceptionhandling;

import java.io.*;

public class CheckedExdemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		File f = new File("c:\\maheshjava//.txt");
		f.createNewFile();
		System.out.println("main method ended");
	}

}
