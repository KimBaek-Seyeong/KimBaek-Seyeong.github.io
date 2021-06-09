class Data1{
	int i=0;
}

class AA extends Thread{
	public void run() {
		for(int i=0; i<100000; i++) {
			Ex11_08_NotSyncTest.d.i++;
		}
		System.out.println("AA: "+Ex11_08_NotSyncTest.d.i);
	}
}

class BB extends Thread{
	public void run() {
		for(int i=0; i<100000; i++) {
			Ex11_08_NotSyncTest.d.i++;
		}
		System.out.println("BB: "+Ex11_08_NotSyncTest.d.i);
	}
}

public class Ex11_08_NotSyncTest {
	static Data1 d = new Data1();
	public static void main(String[] args) {
		System.out.println("main ½ÃÀÛ");
		
		AA t1 = new AA();
		BB t2 = new BB();
		t1.start();
		t2.start();
		
		System.out.println("main ³¡");
	}
}
