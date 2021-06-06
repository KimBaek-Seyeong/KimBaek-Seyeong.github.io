
public class Ex05_12_overloading {

	public static void main(String[] args) {
		
//		Ex05_12_overloading p = new Ex05_12_overloading();
//		p.plus();
		plus(3, 5);
		plus(11, 20);
	}
	
	//오버로딩 : 같은 메서드 이름으로 여러 개의 메서드를 만드는 기법. 리턴 타입은 구분대상 아님
	//오버라이딩과 헷갈리지 말 것
	static void plus(int x, int y) {
		System.out.println("두 수의 합 : "+(x+y));
	}
	static void plus(double x, double y) {
		System.out.println("두 수의 합 : "+(x+y));
	}
	static void plus(int x, int y, int z) {
		System.out.println("세 수의 합 : "+(x+y+z));
	}
	
}
