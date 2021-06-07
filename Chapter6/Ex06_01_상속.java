class Sports{
	String name;
	int person;
	void display() {
		System.out.println("�̸� : "+name);
		System.out.println("�ο� : "+this.person);
	}
}

class Baseball extends Sports{
	double ta;
	
	Baseball(){
		
	}
	Baseball(String name, int person, double ta){
		this.name = name;
		this.person = person;
		this.ta = ta;
	}
	
	void display() { //�������̵�
		super.display();
		System.out.println("Ÿ�� : "+ta);
	}
}
class Football extends Sports{
	double goal;
	
	Football(){
		
	}
	Football(String name, int person, double goal){
		this.name = name;
		this.person = person;
		this.goal = goal;
	}
	
	void display() { //�������̵�
		super.display();
		System.out.println("��հ� : "+goal);
	}
}


public class Ex06_01_���{
	public static void main(String[] args) {
		Baseball b = new Baseball("�߱�", 9, 0.234);
		Football f = new Football("�౸", 11, 2.5);
		
		b.display();
		System.out.println();
		f.display();
		
		System.out.println();
		
		Sports[] s = {new Baseball("�߱�", 9, 0.234), new Football("�౸", 11, 2.5)};
		int i;
		for (i=0; i<s.length; i++) {
			s[i].display();
		}
	}
}
