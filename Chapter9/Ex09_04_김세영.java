import java.util.Scanner;

class Person{
	String id;
	String pw;
	String name;
	
	Person(){
		
	}
	Person(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
public class Ex09_04_�輼�� {
	public static void main(String[] args) {
		//Person ��ü 3�� �迭�� ����
		Person[] arr = {new Person("maratang", "1234", "������"),
				new Person("marapasta", "5678", "�����Ľ�Ÿ"),
				new Person("mararamen", "9012", "������")};
		
		Scanner sc = new Scanner(System.in);
		String id, pw, name, answer;
		boolean b=false;	int i;
		
		while(true) {
			//Scanner -> id pw �Է� (system in)
			System.out.print("id �Է� : ");
			id = sc.next();
			System.out.print("pw �Է� : ");
			pw = sc.next();
			
			//��ü �迭�� id �� ����?
			for (i=0; i<arr.length; i++) {
				if (arr[i].id.equals(id)) {
					b = true; //������ true
				}
			}
			
			if (b!=true) { //�Է��� id �����Ͱ� �������� ������
				System.out.println("�ش� ���̵� �����ϴ�.");
			}else {
				b=false;
				for (i=0; i<arr.length; i++) {
					if (arr[i].pw.equals(pw)) {
						b = true; //id�� pw �Է°��� ��� true��
						System.out.println(arr[i].name+" ��, �ݰ����ϴ�.");
					}
				}
				if (b!=true) { //�Է��� pw �����Ͱ� �������� ������
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			}
			
			System.out.print("���? ");
			answer = sc.next();

			if("n".equals(answer)) {
				break;
			}
		}
	}
}
