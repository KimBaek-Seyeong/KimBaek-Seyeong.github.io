import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex13_09_JFrame extends JFrame {

	public Ex13_09_JFrame(String string) {
		super(string);

		Container c = getContentPane();
		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.cyan);

		c.add(p1, BorderLayout.CENTER);
		c.add(p2, BorderLayout.SOUTH);

		JTextField t1 = new JTextField(5);
		JTextField t2 = new JTextField(5);
		JTextField t3 = new JTextField(5);

		p1.add(t1);
		p1.add(new JLabel("+"));
		p1.add(t2);
		p1.add(new JLabel("="));
		p1.add(t3);

		JButton b1 = new JButton("확인");
		JButton b2 = new JButton("취소");

		p2.add(b1);
		p2.add(b2);

		b1.addActionListener(new ButtonOk(t1, t2, t3));
		b2.addActionListener(new ButtonCancle(t1, t2, t3));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(400,300);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex13_09_JFrame("덧셈 프로그램");
	}
}

class ButtonOk implements ActionListener {
	JTextField t1;
	JTextField t2;
	JTextField result;

	ButtonOk(JTextField t1, JTextField t2, JTextField result) {
		this.t1 = t1;
		this.t2 = t2;
		this.result = result;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(t1.getText());
			int n2 = Integer.parseInt(t2.getText());
			int sum = n1 + n2;

			result.setText(String.valueOf(sum));
//			result.setText(sum+"");
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "숫자만 입력 가능");
			t1.setText("");
			t2.setText("");
		}
	}
}

class ButtonCancle implements ActionListener{
	JTextField t1;
	JTextField t2;
	JTextField result;

	ButtonCancle(JTextField t1, JTextField t2, JTextField result) {
		this.t1 = t1;
		this.t2 = t2;
		this.result = result;
	}
	
	public void actionPerformed(ActionEvent e) {
		t1.setText("");
		t2.setText("");
		result.setText("");
	}
}