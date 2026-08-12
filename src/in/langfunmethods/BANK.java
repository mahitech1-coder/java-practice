package in.langfunmethods;

public class BANK {
	void employee(String name, int id, float amount, double salary) {
		System.out.println(name);
		System.out.println(id);
		System.out.println(amount);
		System.out.println(salary);

	}
	void calculate(int amount,double salary) {
		int total=(int) (amount*salary);
		System.out.println(total);
		
	}

	public static void main(String[] args) {
		System.out.println("main method called");
		BANK  b=new BANK ();
		b.employee("mahesh",101,10000.0f,30000.0);
		b.calculate(2000,30000);
		
	}
	
}
