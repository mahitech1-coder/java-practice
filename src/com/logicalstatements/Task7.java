package com.logicalstatements;

import java.util.Scanner;

public class Task7 {
	static Scanner sc = new Scanner(System.in);

	String getMarksInfo(int marks) {
		System.out.println("enter you subjects");
		int subjects=sc.nextInt();
		String grade=switch((marks/subjects)/10);
		case 10,9->"grade A";
		case 8->{
			System.out.println("results are good:");
			yield "grade b";
		}
		
			case 7,6->{
				System.out.println("results are average");
				yield "grade c";
			}
			case 5,4->{
				System.out.println("just passed");
				yield "grade d";
			}
				default->"fail;"
			
		};
			
return grade;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks");
		int marks = sc.nextInt();

	}

}
