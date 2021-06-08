class Test{
	int x=2;
	void display() {
		System.out.println("Test x: "+x);
	}
}
class Test2 extends Test{
	void display() {
		System.out.println("Test x: "+x*x);
	}
}

public class Ex08_05_Anonymous {
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		
		Test t2 = new Test2();
		t2.display();
		
		new Test() {
			void display() {
				System.out.println("Test x: "+x*x*x);
			}
		}.display();
		//익명클래스
		//특정 클래스 상속받아 특정메소드를 오버라이딩 한 후
		//해당 객체를 단 한개만 만들어 사용한다면
		//굳이 상속받는 클래스를 만들지 않고 직접 객체를 생성하는 방법
	}
}
