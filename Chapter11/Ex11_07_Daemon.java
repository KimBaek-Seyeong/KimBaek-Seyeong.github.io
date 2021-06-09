class DaemonTest extends Thread {
	public void run() {
		while (true) {
			try {
				sleep(3000);
			} catch (InterruptedException ie) {

			}
			
			if (Ex11_07_Daemon.as == true) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		System.out.println("작업 파일이 자동저장되었습니다.");
	}
}

public class Ex11_07_Daemon {

	static boolean as = false; // static 멤버변수는 static으로 설정되어야 함

	public static void main(String[] args) {
		DaemonTest dt = new DaemonTest();
		dt.setDaemon(true);
		dt.start();

		Thread t = new Thread();
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
			try {
				t.sleep(1000);
			} catch (InterruptedException ie) {

			}

			if (i == 5) {
				as = true;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
