package in.langfunmethods;
import java.util.Scanner;
public class Calculate {
	static Scanner sc=new Scanner(System.in);
	
	static int addition(int a,int b) {
		int sum=a+b;
		System.out.println("enter a value:");
		int x=sc.nextInt();
		System.out.println("enter b value:");
		int y=sc.nextInt();
		return sum;	
	}
	static int subraction(int a,int b) {
		int diff=a-b;
		System.out.println("enter a value:");
		int x=sc.nextInt();
		System.out.println("enter b value:");
		int y=sc.nextInt();
		return diff;	
		
	}
	static int multiply(int a,int b) {
		int product=a*b;
		System.out.println("enter a value:");
		int x=sc.nextInt();
		System.out.println("enter b value:");
		int y=sc.nextInt();
		return product;
		
	}
	static int division(int a,int b) {
		int quotient=a/b;
		System.out.println("enter a value:");
		int x=sc.nextInt();
		System.out.println("enter b value:");
		int y=sc.nextInt();
		return quotient;	
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		int n1=addition(20,30);
		System.out.println("sum is:"+n1);
		int n2=subraction(50,90);
		System.out.println("diff is :"+n2);
		int n3=multiply(50,60);
		System.out.println("multiply is:"+n3);
		int n4=division(60,20);
		System.out.println("division is:"+n4);

	}

}
