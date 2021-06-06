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
		System.out.println(title+" : "+price+"��");
	}
}

public class Ex05_17_�輼�� {
	public static void main(String[] args) {
		
		//Ŭ���� ��ü 3�� �迭
		Scanner sc = new Scanner(System.in);
		
		int i, price;
		String title;
		Book[] arr = new Book[3];
		
		//��ü �迭 �Է�
		for (i=0; i<arr.length; i++) {
			System.out.print("�������� �Է��ϼ��� : ");
			title = sc.nextLine();
			System.out.print("������ �Է��ϼ��� : ");
			price = sc.nextInt();
			sc.nextLine(); //price �Է� �� �Բ� �� ����(���๮��) ����
			arr[i] = new Book(title, price);
			System.out.println();
		}
		
		//��ü �迭 ���� ��� (���ٷ�)
		for (i=0; i<arr.length; i++) {
			arr[i].display();
		}
	}
}
