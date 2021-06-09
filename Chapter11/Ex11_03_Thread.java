class AZ1 implements Runnable { // 대문자 A~Z Runnable
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

class AZ2 extends Thread { // 소문자 a~z Thread
	public void run() {
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c ", (i + 97));
			try {
				sleep(100); //0.1초 = 100 //sleep()은 실행에 딜레이를 주는 메서드지만 예외처리 필수 //new InterruptedException()
			} catch(InterruptedException ie) {
				
			}
		}
		System.out.println();
	}
}

public class Ex11_03_Thread {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		AZ1 a = new AZ1();
		Thread trd = new Thread(a);
		trd.start();
		AZ2 a2 = new AZ2();
		a2.start();
		
		for (int i = 1; i <= 30; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("프로그램 종료");
	}
}
