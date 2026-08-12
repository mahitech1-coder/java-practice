package com.logicalstatements;

import java.util.Scanner;

//Wap for grade using switch case
public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a grade");
		String grade=sc.next();
		switch(grade) {
		case "A"->System.out.println("EXCELLENT");
		case "B"->System.out.println("BETTER");
		case "C"->System.out.println("JUST PASS");
		case "D"->System.out.println("PASS");
		case "E"->System.out.println("FAIL");
		default->System.out.println("no result");
		}
		
		
	}

}
