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
		System.out.println("���α׷� ����");
		
		ThreadRun t = new ThreadRun();
//		t.run();
		
		Thread trd = new Thread(t);
		trd.start(); //thread ȣ���� ���� ���Ұ�
		
		System.out.println("���α׷� ����");
	}
}

//���μ��� : �������� ���α׷�