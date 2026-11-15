package in.langfunmethods;

public class Samplemethods {
	void hello() {
		System.out.println("hello method called");
		
	}
	void welcome() {
		System.out.println("welcome method called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Samplemethods sm=new Samplemethods();
		
		get();
		put();
		sm.hello();
		sm.welcome();
		
	}
	 static void get() {
		System.out.println("get method called");
	}
	static void put() {
		System.out.println("put method called");
	}

}
