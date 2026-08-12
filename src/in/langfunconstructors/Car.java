package in.langfunconstructors;

public class Car {
	String name;
	double price;

	Car(String n,double p) {
		name=n;
		price=p;
		display();
		
	}

	void display() {
		System.out.println("car name is:"+name);
		System.out.println("car price is:"+price);

	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		Car c1=new Car("bmw",20000);
	}

}
