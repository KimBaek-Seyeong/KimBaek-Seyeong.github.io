import javax.swing.JOptionPane;

public class Ex11_04_single { //single thread
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��� ���� "+input+"�Դϴ�.");
		
		Thread t = new Thread();
		for (int i=10; i> 0; i--) {
			System.out.println(i);
			try {
				t.sleep(1000);
			} catch (InterruptedException ie) {
				
			}
		}
	}
}
