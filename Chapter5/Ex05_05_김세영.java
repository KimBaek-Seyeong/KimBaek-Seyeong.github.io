import java.util.Scanner;

class Student{
	String name;
	int kor, eng, mat;
	
	//�հ� ���ϴ� �޼��� ����
	int sum() {
		return kor+eng+mat;
	}
	//��� ���ϴ� �޼��� ����
	double avg() {
		return (double)kor+eng+mat/3.0;
	}
}


public class Ex05_05_�輼�� {

	public static void main(String[] args) {
		
		// �Է� - �̸�, ����, ����, ����
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.print("������ �Է��ϰ��� �ϴ� �л��� �̸� : ");
		st.name = sc.next();
		System.out.print(st.name+"�� ���� ���� : ");
		st.kor = sc.nextInt();
		System.out.print(st.name+"�� ���� ���� : ");
		st.eng = sc.nextInt();
		System.out.print(st.name+"�� ���� ���� : ");
		st.mat = sc.nextInt();
		
		//�հ� �޼��� ȣ��
		int sumRes = st.sum();
		//��� �޼��� ȣ��
		double avgRes = st.avg();
		
		System.out.println("�հ� : "+sumRes);
		System.out.printf("��� : %.2f", avgRes);
	}
}
