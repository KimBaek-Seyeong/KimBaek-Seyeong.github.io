import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Ex13_10_ItemEvent extends JFrame {
	String[] text = { "사과", "배", "체리" };

//	JRadioButton b1 = new JRadioButton();
//	JRadioButton b2 = new JRadioButton();
//	JRadioButton b3 = new JRadioButton();
	JRadioButton[] radio = new JRadioButton[3];

	ImageIcon[] image = { new ImageIcon("src/images/apple.jpg"), new ImageIcon("src/images/pear.jpg"),
			new ImageIcon("src/images/cherry.jpg") };

	JLabel label = new JLabel("   ");

	Ex13_10_ItemEvent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		JPanel p1 = new JPanel();
//		JPanel p2 = new JPanel();

		p1.setBackground(Color.DARK_GRAY);
//		p2.setBackground(Color.GRAY);

		ButtonGroup group = new ButtonGroup();

		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			radio[i].addItemListener(new ButtonAction());
			group.add(radio[i]); // 하나만 선택하도록
			p1.add(radio[i]);
		}
		
		radio[1].setSelected(true);
		
		c.add(p1, BorderLayout.NORTH);
		c.add(label, BorderLayout.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);

//		pack();
		setSize(350, 400);
		setVisible(true);
	}

	class ButtonAction implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (radio[0].isSelected()) {
				label.setIcon(image[0]);
			} else if (radio[1].isSelected()) {
				label.setIcon(image[1]);
			} else {
				label.setIcon(image[2]);
			}
		}
	}

	public static void main(String[] args) {
		new Ex13_10_ItemEvent();
	}
}
