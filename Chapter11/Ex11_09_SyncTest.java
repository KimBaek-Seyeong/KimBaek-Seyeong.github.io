class Data2 {
	int i = 0;
}

class S1 extends Thread {
	public void run() {
		for (int i = 0; i < 100000; i++) {
			synchronized (Ex11_09_SyncTest.d) {
				Ex11_09_SyncTest.d.i++;
			}
		}
		System.out.println("S1: " + Ex11_09_SyncTest.d.i);
	}
}

class S2 extends Thread {
	public void run() {
		for (int i = 0; i < 100000; i++) {
			synchronized (Ex11_09_SyncTest.d) {
				Ex11_09_SyncTest.d.i++;
			}
		}
		System.out.println("S2: " + Ex11_09_SyncTest.d.i);
	}
}

public class Ex11_09_SyncTest {
	static Data2 d = new Data2();

	public static void main(String[] args) {
		System.out.println("main ½ÃÀÛ");

		S1 t1 = new S1();
		S2 t2 = new S2();
		t1.start();
		t2.start();

		System.out.println("main ³¡");
	}
}
