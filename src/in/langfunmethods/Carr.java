package in.langfunmethods;

public class Carr {
	static void cardetails(String name, String color, String brand, String  model) {
		System.out.println(name);
		System.out.println(color);
		System.out.println(brand);
		System.out.println(model);
	}

	public static void main(String[] args) {
		System.out.println("main method called");
		cardetails("BMW","GREEN","GERMAN LUXURY","BMW M4");
		cardetails("BREZZA","WHITE","MARUTHI","2023");


	}

}
