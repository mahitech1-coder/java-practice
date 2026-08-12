package com.logicalstatements;

import java.util.Scanner;

public class Task6 {
	static String getDayInfo(int day) {
		String result=switch(day) {
		case 1->"sunday";
		case 2->"monday";
		case 3->"tuesday";
		case 4->"wednesday";
		case 5->"thursday";
		case 6->"friday";
		case 7->"saturday";
		default->"unknown";
		};

		return result ;
	}
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day to know!:");
		int day = sc.nextInt();
		String result = getDayInfo(day);
		System.out.println("the day is:" + result);

	}

}
