
public class Ex05_03_메서드 {

	public static void main(String[] args) {
		
		System.out.println("main");
		prn(); //호출 : 정의된 곳으로 넘어간다
		int result = add(10,20); //argument
		double result2 = sub(30.2, 1.3, 7);
		System.out.println("add : "+result);
		System.out.println("sub : "+result2);
		System.out.println("main 끝");
		
		Ex05_03_메서드 ex = new Ex05_03_메서드();
		ex.mul();
		
	}
	
	static void prn() { //prn 메서드 정의
		System.out.println("prn 메서드 정의");
		System.out.println("HAHAHA");
	} //호출한 곳으로 돌아간다
	
	static int add(int a, int b) { //매개변수 : 호출된 메서드에서 이어받을 수 있는 변수
		int result;
		result = a+b;
		System.out.println("result : "+result);
		return result;
	}
	
	static double sub(double a, double b, double c) {
		double result;
		result = a-b-c;
		System.out.println("result : "+result);
		return result;
	}
	
	void mul() {
		System.out.println("mul");
	}
} //class

//메서드 : 특정 작업을 수행하도록 독립적으로 작성된 프로그램, 처리 후 결과, 코드 분할과 재사용
//리턴타입 메서드이름([타입 변수명1, 타입 변수명2]){ }