
public class Ex07_03_throw {

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
		try {
			int result = 7/0;
		}catch(ArithmeticException ae) {
			System.out.println("call() ���� �߻�");
			throw ae; //ȣ��� ������ ���� �߻� ������ �ѱ�
		}
	}
}
