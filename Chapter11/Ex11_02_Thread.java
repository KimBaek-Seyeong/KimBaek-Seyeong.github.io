class ThreadRun2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print(i+1+" ");
		}
		System.out.println();
	}
}

public class Ex11_02_Thread {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		ThreadRun2 t = new ThreadRun2();
		t.start(); //다른 코드와 동시에 돌아감(메인 메소드가)
		
		System.out.println("프로그램 종료");
	}

}
