class Student extends Ex09_01_toString{
	private int hakbun;
	private String name;
	
	//constructor
	Student(){
		
	}
	Student(int hakbun, String name){
		this.hakbun = hakbun;
		this.name = name;
	}	
	//setter
	void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	void setName(String name) {
		this.name = name;
	}
	//getter
	int getHakbun() {
		return hakbun;
	}
	String getName() {
		return name;
	}
	//print method
	void display() {
		System.out.println("�й� : "+hakbun);
		System.out.println("�̸� : "+name);
	}
	
	public String toString() {
		return hakbun+","+name;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student)obj;
			return this.hakbun == s.hakbun;
		}else return false;
	}
}


public class Ex09_01_toString {
	public static void main(String[] args) {
		Student s1 = new Student(20, "����");
		Student s2 = new Student(90, "�¿�");
		
		s1.display();
		System.out.println();
		s2.display();
		System.out.println();
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s2.toString());
		
		Student s3 = new Student(20, "ȿ��");
		Student s4 = new Student(20, "ȿ��");
		System.out.println(s3 == s4);
		System.out.println();
		
		Object o = s4;
		boolean b = s3.equals(s4);
		System.out.println(b);
	}
}

/*
object Ŭ������ toString() : 
�������� == ��������.toString() 
boolean equals : 
*/