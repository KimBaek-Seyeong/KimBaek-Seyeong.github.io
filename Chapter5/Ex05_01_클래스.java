
class Person{ //Ŭ���� �̸��� �빮�ڷ� ����
	//�ɹ�����
	String name; //instance variance
	int age;
	double height;
	static String nation; //static���� : ��������, ���� ��ü���� �����ؼ� ����ϰ� �� //Ŭ��������
	
	void addAge(int x) {
		age += 5;
	}
	
	Person(){ //default ������
		
	}

	Person(String n, int a){
		name = n;
		age = a;
	}
}

public class Ex05_01_Ŭ���� {

	public static void main(String[] args) {
		
		//Ŭ���� : �⺻ ������ Ÿ���� �Ѱ踦 �غ��ϱ� ���� ����, ����� ���� �ڷ���
		int a = 10;
		double d = 3.4;
		String s = "����";
		Person.nation = "���ѹα�";
		
		Person p = new Person(); //��ü ����
		p.name = "������";
		p.age = 20;
		p.height = 159.7;
		p.addAge(5);
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.height);
		System.out.println(Person.nation);
		
		Person p2 = new Person();
		p2.name = "�輼��";
		p2.age = 25;
		p2.height = 162;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		System.out.println(p.nation);
		
		Person p3 = new Person("�����", 40);
		
	}
}
