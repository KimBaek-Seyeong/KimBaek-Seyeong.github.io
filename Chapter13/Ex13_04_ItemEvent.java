import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Ex13_04_sub extends Frame implements ItemListener {
	List list = new List(3, true);
	Choice ch = new Choice();

	// 변수 초기화영역
	{
		list.add("지리산");
		list.add("한라산");
		list.add("덕유산");
		list.add("금강산");
		list.add("속리산");

		ch.add("진달래");
		ch.add("벚꽃");
		ch.add("장미");
		ch.add("국화");
		ch.add("개나리");
	}

	Ex13_04_sub() {

		setLayout(new FlowLayout());
		super.add(list);
		this.add(ch);

//		Button=>ActionEvent=>addActionListener 부착
//		ActionListener 인터페이스 상속=>actionPerformed()완성

//		List,Choice=>ItemEvent=>addItemListener 부착
//		ItemListener 인터페이스 상속=>itemStateChanged() 완성

//		이벤트가 발생하면 이벤트 클래스 객체가 자동으로 생성된다.
		list.addItemListener(this); // new ItemEvent()
		ch.addItemListener(this);// new ItemEvent()
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
//		ItemEvent e = new ItemEvent()
		// System.out.println("item event 발생");

		Object obj = e.getSource();

		if (obj == list) {
//			System.out.println("List에서 이벤트 발생");
			int[] index_arr = list.getSelectedIndexes();
			String[] item_arr = list.getSelectedItems();
//			0:지리산/
//			0:지리산/2:덕유산
//			0:지리산/2:덕유산/4:속리산
			for (int i = 0; i < index_arr.length; i++) {
				System.out.print(index_arr[i] + ":" + item_arr[i] + "/");
			}
			System.out.println();
		} else {
			// System.out.println("Choice에서 이벤트 발생");
			System.out.print(ch.getSelectedIndex() + ":");
			System.out.println(ch.getSelectedItem());
		}
	}
}

public class Ex13_04_ItemEvent {
	public static void main(String[] args) {

		Ex13_04_sub sub = new Ex13_04_sub();
		sub.setTitle("ItemEvent");

		sub.setSize(500, 350);
		sub.setVisible(true);
	}
}