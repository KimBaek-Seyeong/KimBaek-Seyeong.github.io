import javax.swing.JOptionPane;

public class Ex11_04_single { //single thread
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력한 값은 "+input+"입니다.");
		
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
