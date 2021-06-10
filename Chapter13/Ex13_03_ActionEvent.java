import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Ex13_03_sub extends Frame implements ActionListener{
	
	Button b1,b2,b3,b4;
	
	Ex13_03_sub(String title){
		super(title);
		super.addWindowListener(new MyWindow());
		
		setSize(400,300);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("screen:" + screen);
		
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		
		setLocation(xpos,ypos);
		
		b1 = new Button("�����");
		b2 = new Button("������");
		b3 = new Button("�Ķ���");
		b4 = new Button("�ʷϻ�");
		
		b1.setBackground(Color.pink);
		b1.setForeground(Color.GREEN);
		
//		Button=>ActionEvent=>addActionListener ����
//		ActionListener �������̽� ���=>actionPerformed()�ϼ�
		
//		�̺�Ʈ�� �߻��ϸ� �̺�Ʈ Ŭ���� ��ü�� �ڵ����� �����ȴ�.
		b1.addActionListener(this);// new ActionEvent();
		b2.addActionListener(this);// new ActionEvent();
		b3.addActionListener(this);// new ActionEvent();
		b4.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		super.add(b1);
		this.add(b2);
		add(b3);
		add(b4);
		
		setVisible(true);
	}
	
//	ActionEvent e = new ActionEvent();
	@Override
	public void actionPerformed(ActionEvent e) { // call back �޼���
		//System.out.println("��ư ����");
		
		Object obj = e.getSource();
		if(obj == b1) {
			System.out.println("����� ��ư ����");
			setBackground(Color.yellow);
		}else if(obj == b2) {
			System.out.println("������ ��ư ����");
			setBackground(Color.RED);
		}else if(obj == b3){
			System.out.println("�Ķ��� ��ư ����");
			setBackground(Color.BLUE);
		}else {
			System.out.println("�ʷϻ� ��ư ����");
			setBackground(Color.GREEN);
		}
	}
	
	class MyWindow extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("â�� ����");
			System.exit(0);
		}
		
		public void windowActivated(WindowEvent e) {
			System.out.println("â�� Ȱ��ȭ��");
		}
	}
}

public class Ex13_03_ActionEvent {
	public static void main(String[] args) {
		
		Ex13_03_sub sub = new Ex13_03_sub("AWT����");
	}

}