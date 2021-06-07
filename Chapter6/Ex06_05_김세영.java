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
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}

class Worker extends Member{ //상속
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
		System.out.println("회사명 : "+company);
		System.out.println("부서 : "+part);
	}
}

class Teacher extends Worker{ //M을 상속받는 W를 상속받는 T
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
		System.out.println("담당 과목 : "+subject);
	}
}

public class Ex06_05_김세영 {

	public static void main(String[] args) {
		
		Member m = new Member("성시경", 30);
		Worker w = new Worker("채경", 30, "중앙", "홍보부");
		Teacher t = new Teacher("혜리", 50, "현대고등학교", "생활지도부", "음악");
		
		//display 호출
		m.display();
		System.out.println();
		w.display();
		System.out.println();
		t.display();
		System.out.println();
		
	}
}
