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
		System.out.println("���α׷� ����");
		
		ThreadRun2 t = new ThreadRun2();
		t.start(); //�ٸ� �ڵ�� ���ÿ� ���ư�(���� �޼ҵ尡)
		
		System.out.println("���α׷� ����");
	}

}
