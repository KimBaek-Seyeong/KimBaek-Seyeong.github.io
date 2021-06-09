import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	
	public Card(){
		
	}
	public Card(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return name + "\t" + tel;
	}
	
	
	
}
public class Ex10_08_�輼�� {
	public static void main(String[] args) {

		int num;
		String name, phone;
		boolean button=true, youThere=false;
		
		ArrayList<Card> c = new ArrayList<Card>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���α׷��� �����մϴ�.");
		while(button) {
			System.out.println("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����");
			System.out.print("���ϴ� �޴� ��ȣ �Է� : ");
			num = sc.nextInt();
			
			if (num == 1) {
				System.out.print("�̸��� �Է��ϼ��� : ");
				name = sc.next();
				System.out.print("��ȭ ��ȣ�� �Է��ϼ��� : ");
				phone = sc.next();
				
				//Card �迭�� ����
				Card p = new Card(name, phone);
				c.add(p);
				
				System.out.println("�߰� �Ǿ����ϴ�.\n");				
			} else if (num == 2) {
				System.out.print("�̸��� �Է��ϼ��� : ");
				name = sc.next();
				
				//�̸��� ���� ���� arraylist�� ������ "�̸��� �߸� �Է��ϼ̽��ϴ�."
				for (int i=0; i<c.size(); i++) {					
					if (c.get(i).getName().equals(name)) {
						youThere = true;
						c.remove(i);
						System.out.println("���� �Ǿ����ϴ�.\n");
					}
				}
				
				if(youThere != true) {
					System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.\n");
				}
				
			} else if (num == 3) {
				System.out.print("�̸��� �Է��ϼ��� : ");
				name = sc.next();
				System.out.print("������ ��ȭ ��ȣ�� �Է��ϼ��� : ");
				phone = sc.next();
				Card p = new Card(name, phone);
				
				//�̸��� ���� ���� arraylist�� ������ "�̸��� �߸� �Է��ϼ̽��ϴ�."
				for (int i=0; i<c.size(); i++) {
					if (c.get(i).getName().equals(name)) {
						youThere = true;
						c.set(i, p);
						System.out.println("���� �Ǿ����ϴ�.\n");
					}
				}
				
				if(youThere != true) {
					System.out.println("�̸��� �߸� �Է��ϼ̽��ϴ�.");
				}
			} else if (num == 4) {
				System.out.println("�̸�\t��ȭ��ȣ");
				
				for (int i=0; i<c.size(); i++) {
					Card tmp = c.get(i);
					System.out.println(tmp);
				}
				
				System.out.println();
			} else if (num == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
			}
		}
	}
}


