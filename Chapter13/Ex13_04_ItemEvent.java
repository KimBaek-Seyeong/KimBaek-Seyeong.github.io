import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Ex13_04_sub extends Frame implements ItemListener {
	List list = new List(3, true);
	Choice ch = new Choice();

	// ���� �ʱ�ȭ����
	{
		list.add("������");
		list.add("�Ѷ��");
		list.add("������");
		list.add("�ݰ���");
		list.add("�Ӹ���");

		ch.add("���޷�");
		ch.add("����");
		ch.add("���");
		ch.add("��ȭ");
		ch.add("������");
	}

	Ex13_04_sub() {

		setLayout(new FlowLayout());
		super.add(list);
		this.add(ch);

//		Button=>ActionEvent=>addActionListener ����
//		ActionListener �������̽� ���=>actionPerformed()�ϼ�

//		List,Choice=>ItemEvent=>addItemListener ����
//		ItemListener �������̽� ���=>itemStateChanged() �ϼ�

//		�̺�Ʈ�� �߻��ϸ� �̺�Ʈ Ŭ���� ��ü�� �ڵ����� �����ȴ�.
		list.addItemListener(this); // new ItemEvent()
		ch.addItemListener(this);// new ItemEvent()
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
//		ItemEvent e = new ItemEvent()
		// System.out.println("item event �߻�");

		Object obj = e.getSource();

		if (obj == list) {
//			System.out.println("List���� �̺�Ʈ �߻�");
			int[] index_arr = list.getSelectedIndexes();
			String[] item_arr = list.getSelectedItems();
//			0:������/
//			0:������/2:������
//			0:������/2:������/4:�Ӹ���
			for (int i = 0; i < index_arr.length; i++) {
				System.out.print(index_arr[i] + ":" + item_arr[i] + "/");
			}
			System.out.println();
		} else {
			// System.out.println("Choice���� �̺�Ʈ �߻�");
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