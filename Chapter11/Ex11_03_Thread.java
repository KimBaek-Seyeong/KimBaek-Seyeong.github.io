class AZ1 implements Runnable { // �빮�� A~Z Runnable
	public void run() {
		Thread t = new Thread();
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c ", (i + 65));
			try {
				t.sleep(100);
			} catch(InterruptedException ie) {
				
			}
		}
		System.out.println();
	}
}

class AZ2 extends Thread { // �ҹ��� a~z Thread
	public void run() {
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c ", (i + 97));
			try {
				sleep(100); //0.1�� = 100 //sleep()�� ���࿡ �����̸� �ִ� �޼������� ����ó�� �ʼ� //new InterruptedException()
			} catch(InterruptedException ie) {
				
			}
		}
		System.out.println();
	}
}

public class Ex11_03_Thread {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");

		AZ1 a = new AZ1();
		Thread trd = new Thread(a);
		trd.start();
		AZ2 a2 = new AZ2();
		a2.start();
		
		for (int i = 1; i <= 30; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("���α׷� ����");
	}
}
