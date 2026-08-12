
//Level 2
//11. Count digits
//12. Sum of digits
//13. Product of digits
//14. Reverse number
//15. Palindrome
//16. Largest digit
//17. Smallest digit
//18. Count even digits
//19. Count odd digits
//20. Average of digits

//11. Count digits
package com.tasks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = n; i != 0; i = i / 10) {
			count = count + 1;

		}
		System.out.println("THE COUNT IS:" + count);

	}

}
