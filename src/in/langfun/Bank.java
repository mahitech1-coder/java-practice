package in.langfun;

public class Bank {
	String name="MAHESH";
	int acc_no=101;
	float acc_balance=60000.0f;
	void display() {
		System.out.println("bank_ name :"+name);
		System.out.println("bank number is:"+acc_no);
		System.out.println("bank balance is:"+acc_balance);
		acc_no++;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Bank b=new Bank();
		b.display();
		Bank b1=new Bank();
		b1.name="raju";
		b1.acc_balance=56000.00f;
		b.display();
		Bank b2=new Bank();
		b1.name="raju";
		b1.acc_balance=56000.00f;
		b.display();
		
		
		
		

	}

}
