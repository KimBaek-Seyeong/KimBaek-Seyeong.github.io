import javax.swing.JOptionPane;

class Thread05 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(100);
			} catch (InterruptedException ie) {

			}
		}
	}
}

public class Ex11_05_multi {
	public static void main(String[] args) {
		Thread05 t = new Thread05();
		t.start();

		String s = JOptionPane.showInputDialog("좋아하는 값을 입력하세요.");
		System.out.println("입력 값 : " + s);
	}
}
