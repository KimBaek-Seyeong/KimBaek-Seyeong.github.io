import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Ex13_06_sub extends Frame implements WindowListener{
	Ex13_06_sub(){
		super.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("â�� ����");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("â�� ����");
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("â�� Ȱ��ȭ��");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("â�� �ּ�ȭ��");
	}
}

public class Ex13_06_WindowEvent {
	public static void main(String[] args) {
		Frame f = new Ex13_06_sub();
		f.setSize(300, 300);
		f.setVisible(true);
		
	}
}
