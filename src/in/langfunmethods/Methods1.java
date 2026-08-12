package in.langfunmethods;
// WAP to create methods on square,rectangle,triangle,circle
// square:side*side
//rectangle:length*breadth
//triangle:0.5*base*height
//circle:PI*r*r
import java.util.Scanner;
public class Methods1 {
	 static double findSquare(double s) {
		return s*s;
		
	}
	 static double findRectangle(double length,double breadth) {
		return length*breadth;
	}
	 static double findTriangle(double base,double height) {
		 return 0.5*base*height;
		
	}
	 static double findCircle(double r) {
		 return Math.PI*r*r;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side is:");
		double side=sc.nextDouble();
		System.out.println("Area of square is:"+findSquare(side));
		System.out.println("Enter length and breadth:");
		double l=sc.nextDouble();
		System.out.println("enter breadth is:");
		double b=sc.nextDouble();
		System.out.println("area of rectangle:"+findRectangle(l,b));
		System.out.println("enter base value:");
		double base=sc.nextDouble();
		System.out.println("enter height value:");
		double height=sc.nextDouble();
		System.out.println("area of triangle is:"+findTriangle(base,height));
		double radius=sc.nextDouble();
		System.out.printf("area of circle :%.4f",findCircle(radius));
		
		
	}

}
