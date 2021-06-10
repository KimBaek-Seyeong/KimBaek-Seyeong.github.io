import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex13_08_sub extends Frame {
	Ex13_08_sub() {
		super.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("√¢¿Ã ¥›»˚");
				System.exit(0);
			}

			public void windowActivated(WindowEvent e) {
				System.out.println("√¢¿Ã »∞º∫»≠µ ");
			}
		});
	}
}

public class Ex13_08_WindowAdapter {
	public static void main(String[] args) {
		Frame f = new Ex13_08_sub();
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
