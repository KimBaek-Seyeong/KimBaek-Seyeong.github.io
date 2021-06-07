class Person{
	private String name;
	private int age;
	
	Person(){
		
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	
	void display() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}

class Student extends Person{
	private int kor;
	private int eng;
	
	Student(String name, int age, int kor, int eng){
		setName(name);
		setAge(age);
		this.kor = kor;
		this.eng = eng;
	}
	
	void display() {
		super.display();
		System.out.println("���� ���� : "+kor);
		System.out.println("���� ���� : "+eng);
	}
}

class Employee extends Person{
	private String company;
	private String part;
	
	Employee(String name, int age, String company, String part){
		setName(name);
		setAge(age);
		this.company = company;
		this.part = part;
	}
	
	void display() {
		super.display();
		System.out.println("ȸ��� : "+company);
		System.out.println("�μ� : "+part);
	}
}

public class Ex06_03_��� {

	public static void main(String[] args) {
		
		Person p = new Person("ȿ��", 12);
		Student s = new Student("����", 23, 89, 72);
		Employee e = new Employee("����", 64, "�Ｚ", "������");
		
		p.display();
		System.out.println();
		s.display();
		System.out.println();
		e.display();
	}
}
