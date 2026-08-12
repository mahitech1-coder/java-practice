package in.langfun;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 number : ");
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double avg=(a+b+c)/3;
		System.out.println("average is :"+avg);
		

	}

}
