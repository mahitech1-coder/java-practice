package in.langfunconstructors;

public class Book {
	String title;
	String author;
	int price;

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void display() {
		System.out.println(title + "  " + author + "   " + price);
	}

	public static void main(String[] args) {
		Book b = new Book("java", "john", 500);
		Book b1 = new Book("python", "alex", 700);
		b.display();
		b1.display();

	}

}
