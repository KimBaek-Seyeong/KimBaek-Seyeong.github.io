class Sub {
	public void method() {
		int[] arr = { 7, 8, 9 };
		int i, a = 3;
		try {
			for (i = 0; i <= 3; i++)
				System.out.println(arr[i]);
			a = a / 0;
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		} finally {
			System.out.println("finally ����");
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Sub sup = new Sub();
		sup.method();
	}
}
