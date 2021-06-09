import java.util.HashMap;
import java.util.Scanner;

class Student {
	private String addr;
	private double height;
	private int kor;

	public Student() {

	}

	public Student(String addr, double height, int kor) {
		super();
		this.addr = addr;
		this.height = height;
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "(�ּ�)" + addr + " (Ű)" + height + " (����)" + kor;
	}
}

public class Ex10_15_�輼�� {
	public static void main(String[] args) {

		// map���� ����, key�� �̸�, value�� (�ּ� Ű ����)
		HashMap<String, Student> m = new HashMap<String, Student>();

		Scanner sc = new Scanner(System.in);
		String name, addr, answer;
		double height;
		int kor;

		// �̸� �ּ� Ű ���� �Է�
		System.out.println("���α׷��� �����մϴ�.\n=====�� �Է�====\n");
		while (true) {
			System.out.print("�̸� : ");
			name = sc.next();
			System.out.print("�ּ� : ");
			addr = sc.next();
			System.out.print("Ű(���ڸ� �ۼ�) : ");
			height = sc.nextDouble();
			System.out.print("���� ����(������ �ۼ�) : ");
			kor = sc.nextInt();

			Student s = new Student(addr, height, kor);
			m.put(name, s);

			while (true) {
				System.out.print("��� �Ͻðڽ��ϱ�? ");
				answer = sc.next();
				System.out.println();

				if (!answer.equals("y") && !answer.equals("n")) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				} else break;
			}

			if (answer.equals("n")) {
				for(String i : m.keySet()){
				    System.out.println(i+"="+m.get(i));
				}
				System.out.println("�Է��� �ߴ��մϴ�.");
				break;
			}
		}

		//�˻�
		System.out.println("\n\n=====�˻�=====\n");
		while (true) {
			while (true) {
				System.out.print("ã�� ���� �л��� �����ʴϱ�? ");
				answer = sc.next();
				System.out.println();

				if (!answer.equals("y") && !answer.equals("n")) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				} else break;
			}
			if (answer.equals("n")) {
				System.out.println("�˻��� �ߴ��մϴ�.");
				break;
			}
						
			System.out.println("ã�� ���� �л��� �̸��� �Է��ϼ���.");
			System.out.print("�̸� : ");
			name = sc.next();

			System.out.println();
			if(m.get(name) != null) {
				System.out.println("�˻� ����Դϴ�.");
				System.out.println(name+"="+m.get(name));
				System.out.println();
			} else System.out.println("ã�� �̸��� �����ϴ�.");
			
			System.out.print("��� �Ͻðڽ��ϱ�? ");
			answer = sc.next();
			System.out.println();
			if (answer.equals("n")) {
				System.out.println("�˻��� �ߴ��մϴ�.");
				break;
			}
		}
		
		System.out.println("\n\n=====����=====\n");
		while (true) {
			while (true) {
				System.out.print("������ ������ �����ʴϱ�? ");
				answer = sc.next();
				System.out.println();
				
				if (!answer.equals("y") && !answer.equals("n")) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				} else break;
			}
			if (answer.equals("n")) {
				System.out.println("������ �ߴ��մϴ�.");
				break;
			}
			
			System.out.println("�������� ������ �л��� �̸��� �Է��ϼ���.");
			System.out.print("�̸� : ");
			name = sc.next();
			
			System.out.println();
			if(m.get(name) != null) {
				m.remove(name);
				System.out.println("���� �Ǿ����ϴ�. ���� ������ �Ʒ��� �����ϴ�.");
				for(String i : m.keySet()){
				    System.out.println(i+"="+m.get(i));
				}
			} else System.out.println("�ش� �л��� ������ �����ϴ�.");
			
			System.out.print("��� �Ͻðڽ��ϱ�? ");
			answer = sc.next();
			System.out.println();
			if (answer.equals("n")) {
				System.out.println("������ �ߴ��մϴ�.");
				break;
			}
		}
		
		System.out.println("\n���α׷��� �����մϴ�.");
	}
}
