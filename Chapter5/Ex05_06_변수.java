class Count{
	static int a;//스태틱
	int b; //인스턴스
	void increment() {
		int c=0; //지역변수
		a++; b++; c++;
		System.out.println("Static 변수 a : "+a);
		System.out.println("Instance 변수 b : "+b);
		System.out.println("지역 변수 c : "+c);
		System.out.println();
	}
}

public class Ex05_06_변수 {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.increment();
		c1.increment();

		Count c2 = new Count();
		c2.increment();
		c2.increment();
		
		Count c3 = new Count();
		c3.increment();
		c3.increment();
	}
}

//매개변수 : 메소드 호출 시 시작, 메소드 끝날 때 소멸
//지역변수 : 메소드 안에서만 유효
//인스턴스 변수 : 객체 생성시 시작 객체 참조 객체 없을 때 소멸
//static(클래스) 변수 : 클래스 호출 시 시작하여 프로그램 끝날 때 소멸
//참조변수 : 객체, 주소값 저장
