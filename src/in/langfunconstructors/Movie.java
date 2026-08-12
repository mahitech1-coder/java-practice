package in.langfunconstructors;

public class Movie {
	int movieId;
	String movieName;
	String heroName;
	double rating;

	Movie() {
		this(99);
		System.out.println("no arg constructor");
	}

	Movie(int movieID) {
		this(102,"Bussinessman");
		this.movieId=movieId;
		System.out.println("one arg constructor");
	}

	Movie(int movieId, String movieName) {
		this(103,"Aathadu","Mahesh Babu");
		System.out.println("two arg constructor");
	}

	Movie(int movieId, String movieName, String heroName) {
		this(104,"spyder","Mahesh Babu",6.0);
		this.movieId=movieId;
		this.movieName=movieName;
		this.heroName=heroName;
		System.out.println("three arg constructor");
	}

	Movie(int movieId, String movieName, String heroName, double rating) {
		System.out.println("4 arg constructor");
		this.movieId = movieId;
		this.movieName = movieName;
		this.heroName = heroName;
		this.rating = rating;
	}

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.display();
		Movie m2 = new Movie(100,"Guntur Karam");
		m2.display();
		Movie m3 = new Movie(101, "maharshi", "MaheshBabu", 5.0);
		m3.display();

	}

	void display() {
		System.out.println("movie id is:" + movieId);
		System.out.println("movie name is:" + movieName);
		System.out.println("hero name is:" + heroName);
		System.out.println("movie rating:" + rating);
	}

}
