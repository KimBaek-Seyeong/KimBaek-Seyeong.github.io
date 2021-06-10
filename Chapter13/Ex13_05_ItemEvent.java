import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Ex13_05_sub extends Frame implements ItemListener {
	String[] state = { "�ƽþ�", "����", "������ī" };
	String[][] country = { { "�ѱ�", "�Ϻ�", "�߱�" }, { "��Ż����", "������", "����" }, { "����Ʈ", "���", "�����" } };
	Choice c1, c2;
	Label lb2;

	Ex13_05_sub() {
		Label lb1 = new Label("����� ���� �����ϼ���");
		lb1.setBackground(Color.cyan);

		Panel p = new Panel();
		p.setBackground(Color.pink);

		c1 = new Choice();
		c2 = new Choice();

		for (int i = 0; i < state.length; i++) {
			c1.add(state[i]);
		}
		c2.add("          ");
		p.add(c1);
		p.add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);

		lb2 = new Label(" ");
		lb2.setBackground(Color.yellow);
		lb2.setAlignment(Label.CENTER);

		add(lb1, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		add(lb2, BorderLayout.SOUTH);

		setSize(300, 200);
		setVisible(true);
	}

	public void itemStateChanged(ItemEvent e) {
		System.out.println("�̺�Ʈ �߻�");
		Object obj = e.getSource();
		if (obj == c1) {
			c2.removeAll();
			int a = c1.getSelectedIndex();
			System.out.println("index:" + a);
			for (int i = 0; i < country[a].length; i++) {
				c2.add(country[a][i]);
			}

		} else if (obj == c2) {
			String str = "������ ����� "+c1.getSelectedItem()+"�� "+c2.getSelectedItem();
			lb2.setText(str);
		}
	}
}

public class Ex13_05_ItemEvent {
	public static void main(String[] args) {
		Ex13_05_sub sub = new Ex13_05_sub();

	}
}
