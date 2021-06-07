class Member{
	private String name;
	private int age;
	
	Member(){
		
	}
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	//display
	void display() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}

class Worker extends Member{ //���
	private String company;
	private String part;
	
	Worker(){
		
	}
	Worker(String name, int age, String company, String part){
		super.setName(name);
		super.setAge(age);
		this.company = company;
		this.part = part;
	}
	
	void setCom(String company) {
		this.company = company;
	}
	void setPart(String part) {
		this.part = part;
	}
	
	//display //Override
	void display() {
		super.display();
		System.out.println("ȸ��� : "+company);
		System.out.println("�μ� : "+part);
	}
}

class Teacher extends Worker{ //M�� ��ӹ޴� W�� ��ӹ޴� T
	private String subject;
	
	Teacher(){
		
	}
	Teacher(String name, int age, String company, String part, String subject){
		setName(name);
		setAge(age);
		setCom(company);
		setPart(part);
		this.subject=subject;
	}
	
	//display //Override
	void display() {
		super.display();
		System.out.println("��� ���� : "+subject);
	}
}

public class Ex06_05_�輼�� {

	public static void main(String[] args) {
		
		Member m = new Member("���ð�", 30);
		Worker w = new Worker("ä��", 30, "�߾�", "ȫ����");
		Teacher t = new Teacher("����", 50, "�������б�", "��Ȱ������", "����");
		
		//display ȣ��
		m.display();
		System.out.println();
		w.display();
		System.out.println();
		t.display();
		System.out.println();
		
	}
}
