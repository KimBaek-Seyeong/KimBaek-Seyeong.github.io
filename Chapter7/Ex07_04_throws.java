
public class Ex07_04_throws {
	public static void main(String[] args) {
		System.out.println("main start");
		try{
			call();
		}catch(ArithmeticException ae) {
			System.out.println("main���� ����ó�� ��");
		}
		System.out.println("���� ó�� �Ǿ���");
	}
	static void call() {
		try{
			int result = 7/0;
		}catch(Exception e) {
			System.out.println("���� �߻�");
			throw e;
		}
	}
}

//����ó��
//try catch
//throw
//throws