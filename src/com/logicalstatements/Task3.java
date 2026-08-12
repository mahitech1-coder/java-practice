package com.logicalstatements;

import java.util.Scanner;

//wap input as 1-7 and output as print weekday using switch case
public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		switch(num) {
		case 1->System.out.println("MONDay");
	    case 2->System.out.println("TUESDAY");
	    case 3->System.out.println("WEDNESDAY");
	    case 4->System.out.println("THURSDAY");
	    case 5->System.out.println("FRIDAY");
	    case 6->System.out.println("SATURDAY");
	    case 7->System.out.println("SUNDAY");
	    default->System.out.println("no day found");
		}
		
	}

}
