
public class Ex07_04_throws {
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
		try{
			int result = 7/0;
		}catch(Exception e) {
			System.out.println("예외 발생");
			throw e;
		}
	}
}

//예외처리
//try catch
//throw
//throws