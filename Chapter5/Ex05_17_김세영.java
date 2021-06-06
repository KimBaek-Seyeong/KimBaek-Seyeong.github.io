import java.util.Scanner;

class Book{
	private String title;
	private int price;
	
	Book(){
		
	}
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	void display() {
		System.out.println(title+" : "+price+"원");
	}
}

public class Ex05_17_김세영 {
	public static void main(String[] args) {
		
		//클래스 객체 3개 배열
		Scanner sc = new Scanner(System.in);
		
		int i, price;
		String title;
		Book[] arr = new Book[3];
		
		//객체 배열 입력
		for (i=0; i<arr.length; i++) {
			System.out.print("도서명을 입력하세요 : ");
			title = sc.nextLine();
			System.out.print("가격을 입력하세요 : ");
			price = sc.nextInt();
			sc.nextLine(); //price 입력 시 함께 들어간 엔터(개행문자) 제거
			arr[i] = new Book(title, price);
			System.out.println();
		}
		
		//객체 배열 내용 출력 (한줄로)
		for (i=0; i<arr.length; i++) {
			arr[i].display();
		}
	}
}
