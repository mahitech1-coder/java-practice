package in.langfunmethods;
// we can use the static method whenever we have same information 
// we can use the instance data whenever we have different information
//static methods we can call directly
// instance methods we can only by the creation of object reference variable
// without arguments+without parameters
public class Testdemo1 {
	static void addition() {
		System.out.println("addition method called");
	}

	static void multiplication() {
		System.out.println("multiplication metod called");
	}

	static void division() {
		System.out.println("division method called");
	}

	public static void main(String[] args) {
		System.out.println("main method called");
		Testdemo1 t1 = new Testdemo1();
		addition();
		t1.subtract();
		multiplication();
		division();
		t1.modulus();
	}

	void subtract() {
		System.out.println("subtraction method called");
	}

	void modulus() {
		System.out.println("modulus method called");
	}

}
