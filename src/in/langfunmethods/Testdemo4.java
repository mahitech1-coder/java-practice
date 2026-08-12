package in.langfunmethods;

import java.util.Scanner;

public class Testdemo4 {
	static void gettotal( int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("sum is:"+sum);
		
	}
	static void getavg(int a,int b,int c) {
		int avg=(a+b+c)/3;
		System.out.println("average is:"+avg);
	}
	static void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter subject  1 marks:");
		int n1=sc.nextInt();
		System.out.println("enter subject 2 marks:");
		int n2=sc.nextInt();
		System.out.println("enter subject 3 marks:");
		int n3=sc.nextInt();
	}
		

	public static void main(String[] args) {
		display();
		gettotal(20,30,40);
		getavg(20,30,40);
		
		
		
		
				
}
			
}

