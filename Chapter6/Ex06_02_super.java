class Parent{
	int x = 10; //인스턴스 변수
	void method() {
		System.out.println("P_x: "+x);
	}
}

class Child extends Parent{
	int x = 20; //인스턴스 변수 : 0으로 자동 초기화
	void method() {
		int x = 30; //지역 변수 : 자동 초기화되지 않음
		System.out.println("x: "+x);
		System.out.println("this.x: "+this.x);
		System.out.println("super.x: "+super.x);
	}
}


public class Ex06_02_super {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.method();
	}
}
