package in.langfunconstructors;

public class Animal {

	public static void main(String[] args) {
		System.out.println("animal constructor called");

	}

	public class Dog extends Animal {
		public static void main(String args[]) {
			System.out.println("main method started");
			Animal a = new Animal();

		}
	}
}
