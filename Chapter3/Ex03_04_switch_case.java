import java.util.Scanner;

public class Ex03_04_switch_case {

	public static void main(String[] args) {
		
		String fruit;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �����ϴ� ������ �Է��ϼ��� : ");
		fruit = sc.next();
		System.out.println(fruit+", �����Ͻó���?");
		
		switch (fruit) {
		case "apple":
			System.out.println("��ſ��� ��� ���̸� ��õ�մϴ�.");
			break;
		case "banana":
			System.out.println("��ſ��� �ٳ��� ���� ��õ�մϴ�.");
			break;
		default:
			System.out.println("��ſ��� "+fruit+" �ֽ��� ��õ�մϴ�.");
			break;
		}
	}
}
