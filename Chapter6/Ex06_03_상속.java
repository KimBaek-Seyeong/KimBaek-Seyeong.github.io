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
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
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
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
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
		System.out.println("회사명 : "+company);
		System.out.println("부서 : "+part);
	}
}

public class Ex06_03_상속 {

	public static void main(String[] args) {
		
		Person p = new Person("효연", 12);
		Student s = new Student("윤아", 23, 89, 72);
		Employee e = new Employee("백현", 64, "삼성", "연구부");
		
		p.display();
		System.out.println();
		s.display();
		System.out.println();
		e.display();
	}
}
