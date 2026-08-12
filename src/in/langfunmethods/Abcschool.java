package in.langfunmethods;
import java.util.Scanner;
public class Abcschool {
	 static int max=500;
	static int  getTotal(int n1, int n2, int n3, int n4, int n5) {
		int total = n1 + n2 + n3 + n4 + n5;
		System.out.println("the total marks is:"+total);
		return total;
	}
	static double getper(int total,int max) {
		double per=((double)total/max)*100;;
		return per;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the five subject marks:");
		int n1 = sc.nextInt();
		System.out.println("enter the marks of mathematics:" + n1);
		int n2 = sc.nextInt();
		System.out.println("enter the marks of science:" + n2);
		int n3 = sc.nextInt();
		System.out.println("enter the marks of english:" + n3);
		int n4 = sc.nextInt();
		System.out.println("enter the marks of social:" + n4);
		int n5 = sc.nextInt();
		System.out.println("enter the marks of telugu:" + n5);
		int total=getTotal(n1,n2,n3,n4,n5);
		double per=getper(total,max);
		System.out.println("The percentage is:"+per);

	}

}
