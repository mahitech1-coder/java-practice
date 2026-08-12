package in.langfunmethods;
//without return type +with parameters
// calculation program by using methods
public class Testdemo2 {
	static void addition(int a, int b) {
		System.out.println(a + b);// sum //30
	}

	static void subraction(int a, int b) {
		System.out.println(a - b);// diff //-300
	}

	static void multiplication(float a, float b) {
		System.out.println(a * b);// product //3600
	}

	static void division(int a, float b) {
		System.out.println(a / b);// quotient //2.0
	}

	static void modulus(int a, float b) {
		System.out.println(a % b);// remainder //0.0
	}

	public static void main(String[] args) {
		addition(10, 20);
		subraction(200, 500);
		multiplication(400, 900);
		division(100, 50);
		modulus(10, 2);

	}

}
