
public class Ex07_03_throw {

	public static void main(String[] args) {
		
		System.out.println("main start");
		try{
			call();
		}catch(ArithmeticException ae) {
			System.out.println("main에서 예외처리 함");
		}
		System.out.println("정상 처리 되었음");
	}
	static void call() {
		try {
			int result = 7/0;
		}catch(ArithmeticException ae) {
			System.out.println("call() 예외 발생");
			throw ae; //호출된 곳으로 예외 발생 정보를 넘김
		}
	}
}
