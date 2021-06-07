class Person2{
	String name;
	private int age;
	
	Person2(){
		
	}
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	
	void display() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}

class Student2{
	int kor;
	Person2 p = new Person2();
	
	Student2(){
		
	}
	Student2(String name, int age, int kor){
		p = new Person2(name, age);
		this.kor = kor;
	}
	
	void display() {
		System.out.println(p.name+","+p.getAge()+","+kor);
	}
}

public class Ex06_04_포함 {

	public static void main(String[] args) {
		
		Student2 s = new Student2("써니", 30, 78);
		s.display();
		System.out.println(s.kor);
		System.out.println(s.p.name);
		System.out.println(s.p.getAge());
	}
}
