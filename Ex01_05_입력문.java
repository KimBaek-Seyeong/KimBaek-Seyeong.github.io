import java.util.Scanner;

public class Ex01_05_�Է¹� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\"�̸��� �����ּ���\" : ");
//		String name = "�迬��";
		String name = sc.next();
		
		System.out.print("\"���� ������ �ۼ����ּ���\" : ");
		int kor = sc.nextInt();
		
		System.out.print("\"���� ������ �ۼ����ּ���\" : ");
		int eng = sc.nextInt();
		
		System.out.print("\"���� ������ �ۼ����ּ���\" : ");
		int mat = sc.nextInt();
		
		System.out.printf("\"�ȳ��ϼ���, %s ��.\"\n", name);
		System.out.printf("\"%s ���� ���� ������ %d��, ���� ������ %d��, ���� ������ %d�� �Դϴ�.\"\n", name, kor, eng, mat);
		
		int tot = kor + eng + mat;
		float avg = (float)tot/3; //same with float average = total/3.0;
		
		System.out.printf("\"%s ���� ����, ����, ������ ���� �հ�� %d��, ����� %.2f�� �Դϴ�.\"\n", name, tot, avg);
		
	}
}