package in.langfunmethods;

public class Testdemo3 {
	static void display(String a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
	static void calculation(int a,int b,int c,int d) {
		System.out.println(a*b+c+d);
	}
	static void call(float a,float b,double c,double d) {
		System.out.println(a*b+c+d);
	}
	static void multiply(double a,double b,float c,float d) {
		System.out.println(a*b+c+d);
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		display("raju","ravi");
		calculation(20,30,40,50);
		call(20,30,40,50);
		multiply(30,50,60.0f,70.0f);
		
	}

}
