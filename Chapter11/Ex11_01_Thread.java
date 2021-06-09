class ThreadRun implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.print(i+1+" ");
		}
		System.out.println();
	}
}

public class Ex11_01_Thread {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		ThreadRun t = new ThreadRun();
//		t.run();
		
		Thread trd = new Thread(t);
		trd.start(); //thread 호출의 차이 비교할것
		
		System.out.println("프로그램 종료");
	}
}

//프로세스 : 실행중인 프로그램