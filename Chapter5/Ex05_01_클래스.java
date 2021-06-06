
class Person{ //클래스 이름은 대문자로 시작
	//맴버변수
	String name; //instance variance
	int age;
	double height;
	static String nation; //static변수 : 전역변수, 여러 객체에서 공유해서 사용하게 됨 //클래스변수
	
	void addAge(int x) {
		age += 5;
	}
	
	Person(){ //default 생성자
		
	}

	Person(String n, int a){
		name = n;
		age = a;
	}
}

public class Ex05_01_클래스 {

	public static void main(String[] args) {
		
		//클래스 : 기본 데이터 타입의 한계를 극복하기 위해 등장, 사용자 정의 자료형
		int a = 10;
		double d = 3.4;
		String s = "하하";
		Person.nation = "대한민국";
		
		Person p = new Person(); //객체 생성
		p.name = "아이유";
		p.age = 20;
		p.height = 159.7;
		p.addAge(5);
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.height);
		System.out.println(Person.nation);
		
		Person p2 = new Person();
		p2.name = "김세영";
		p2.age = 25;
		p2.height = 162;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		System.out.println(p.nation);
		
		Person p3 = new Person("김수현", 40);
		
	}
}
