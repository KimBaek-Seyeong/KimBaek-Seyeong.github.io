import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Ex13_05_sub extends Frame implements ItemListener {
	String[] state = { "아시아", "유럽", "아프리카" };
	String[][] country = { { "한국", "일본", "중국" }, { "이탈리아", "프랑스", "영국" }, { "이집트", "콩고", "모로코" } };
	Choice c1, c2;
	Label lb2;

	Ex13_05_sub() {
		Label lb1 = new Label("대륙과 나라를 선택하세요");
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
		System.out.println("이벤트 발생");
		Object obj = e.getSource();
		if (obj == c1) {
			c2.removeAll();
			int a = c1.getSelectedIndex();
			System.out.println("index:" + a);
			for (int i = 0; i < country[a].length; i++) {
				c2.add(country[a][i]);
			}

		} else if (obj == c2) {
			String str = "선택한 나라는 "+c1.getSelectedItem()+"의 "+c2.getSelectedItem();
			lb2.setText(str);
		}
	}
}

public class Ex13_05_ItemEvent {
	public static void main(String[] args) {
		Ex13_05_sub sub = new Ex13_05_sub();

	}
}
