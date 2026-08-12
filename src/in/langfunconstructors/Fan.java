package in.langfunconstructors;

public class Fan {
	String company;
	double price;

	Fan(String company, double price) {
		this.company = company;
		this.price = price;
		System.out.println(company+"  "+price);;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Fan f = new Fan("usha", 10000);
	}

}
