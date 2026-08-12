package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExdemo2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr = new FileReader("C:\\maheshjava//.txt");
		int i = fr.read();
		
		while (i != -1) {
			Thread.sleep(200);
			System.out.print((char) i);
			i=fr.read();
		}
	}

}
