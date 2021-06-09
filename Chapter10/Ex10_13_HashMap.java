import java.util.HashMap;
import java.util.Scanner;

class Movie {
	private String title;
	private int age;

	public Movie(String title, int age) {
		super();
		this.title = title;
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return title + "(" + age + ")";
	}
}

public class Ex10_13_HashMap {
	public static void main(String[] args) {
		HashMap<String, Movie> movie = new HashMap<String, Movie>();
		// key : String, value : Movie

		Movie m1 = new Movie("분노의 질주", 15);
		Movie m2 = new Movie("미나리", 12);
		Movie m3 = new Movie("명탐정 코난", 7);

		movie.put("CGV", m1);
		movie.put("롯데시네마", m2);
		movie.put("메가박스", m3);
		movie.put("서울극장", new Movie("도라에몽", 7));

		System.out.println("movie: " + movie);

		Scanner sc = new Scanner(System.in);
		System.out.println("영화관 : ");
		String theater = sc.next();

		if (movie.get(theater) != null) {
			System.out.println("movie : " + movie.get(theater));
		} else System.out.println("잘못 입력하셨습니다.");
		
		Movie m4 = new Movie("어벤져스", 12);
		movie.replace("서울극장", m4);
		System.out.println("movie: " + movie);
		System.out.println(movie.size());
		System.out.println(movie.isEmpty());
		movie.remove("서울극장");
		System.out.println(movie.size());
		System.out.println("movie: " + movie);
		
		movie.clear();
		System.out.println(movie.size());
		System.out.println(movie.isEmpty());
	}
}




