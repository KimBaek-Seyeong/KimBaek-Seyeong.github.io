import java.util.ArrayList;
import java.util.Scanner;

class Book{
	private String title;
	private String author;
	private int price;
		
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return title+"/"+author+"/"+price;
	}
}


public class Ex10_06_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Book> arr = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		
		String t, a;
		int p;
		
		while(true) {
			System.out.print("책 제목 : ");
			t = sc.next();
			System.out.print("책 저자 : ");
			a = sc.next();
			System.out.print("책 가격 : ");
			p = sc.nextInt();
			
			Book b = new Book(t, a, p);
			arr.add(b);
			System.out.print("계속 하시겠습니까? ");
			String ans = sc.next();
			
			if (ans.equals("n")) break;
		}
		
		System.out.println();
		for(int i=0; i<arr.size(); i++) {
			System.out.println((i+1)+"\t"+arr);
		}
	}
}
