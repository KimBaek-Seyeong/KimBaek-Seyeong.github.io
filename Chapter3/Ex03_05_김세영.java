import java.util.Scanner;

public class Ex03_05_�輼�� {

	public static void main(String[] args) {
		
		//char ch='z';
		//ch���� m �Ǵ� M�̸� : morning�̶�� ���
		//a : afternoon
		//e : evening
		//�׿� : �߸� �Է��ϼ̽��ϴ�.
		
		char ch = 'a';
		System.out.println("������ ���ĺ��� "+ch+"�Դϴ�.");
		
		//switch~case
		switch (ch) {
		case 'm':
			System.out.println("���� ��� : Good morning");
			break;
		case 'a':
			System.out.println("���� ��� : Good afternoon");
			break;
		case 'e':
			System.out.println("���� ��� : Good evening");
			break;
		default:
			System.out.println("���� ��� : �߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ĺ��� �Է��ϼ���(�ѱ���) : ");
		char ch2 = sc.next().charAt(0);
				
		//if~else
		if(ch2=='m') {
			System.out.println("Good morning");
		}else if(ch2=='a') {
			System.out.println("Good afternoon");
		}else if(ch2=='e') {
			System.out.println("Good evening");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
