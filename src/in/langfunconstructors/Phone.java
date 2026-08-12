package in.langfunconstructors;

public class Phone {
	String model;
	String ram;
	float price;
	String color;

	Phone(String model, String ram, float price, String color) {
		this.model = model;
		this.ram = ram;
		this.price = price;
		this.color = color;

	}

	public static void main(String[] args) {
		Phone p = new Phone("vivo", "12gb", 20000, "blue");
		Phone p1 = new Phone("samsung", "8gb", 15000, "white");
		Phone p2 = new Phone("oppo", "16gb", 25000, "black");
		p.show();
		p1.show();
		p2.show();

	}

	void show() {
		System.out.println("model is:" + model);
		System.out.println("ram is :" + ram);
		System.out.println("price is:" + price);
		System.out.println("color is:" + color);

	}

}
