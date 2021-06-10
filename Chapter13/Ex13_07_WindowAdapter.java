import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Person{
	
}

class Ex13_07_sub extends Frame {
	Ex13_07_sub(){
		this.addWindowListener(new MyWindow());
	}
	
	class MyWindow extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("√¢¿Ã ¥›»˚");
			System.exit(0);
		}
		public void windowActivated(WindowEvent e) {
			System.out.println("√¢¿Ã »∞º∫»≠µ ");
		}
	}
}

public class Ex13_07_WindowAdapter {
	public static void main(String[] args) {
		Frame f = new Ex13_07_sub();
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
