import java.util.Scanner;

public class Ex03_06_�輼�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸���? ");
		String name = sc.next();
		System.out.print("���� ������? ");
		int kor = sc.nextInt();
		System.out.print("���� ������? ");
		int eng = sc.nextInt();
		System.out.print("���� ������? ");
		int mat = sc.nextInt();
		
		System.out.println("------------------------------");
		System.out.println("�̸�\t����\t����\t����");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat);
		
		int tot = kor+eng+mat;
		float avg = (float)tot/3;
		
		System.out.println("------------------------------");
		System.out.println("���� : "+tot);
		System.out.printf("��� : %.2f\n", avg);
		
		System.out.println("------------------------------");
		
		char grade;
		
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80) {
			grade = 'B';
		}else if(avg>=70) {
			grade = 'C';
		}else if(avg>=60) {
			grade = 'D';
		}else grade = 'F';
		
		System.out.println("���� = "+grade);
		
		switch(grade) {
			case 'A':
				System.out.println("����4 : "+grade);
				break;
			case 'B':
				System.out.println("����3 : "+grade);
				break;
			case 'C':
				System.out.println("����2 : "+grade);
				break;
			case 'D':
				System.out.println("����1 : "+grade);
				break;
			default:
				System.out.println("����0 : "+grade);
			
		}
		
	}
}
