import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

class Ex13_11_sub extends JFrame{
	String[] title = {"사번", "성명", "부서"};
	Object[][] data = {
			{1, "윤아", "인사부"},
			{2, "태연", "개발부"},
			{1, "수영", "총무부"}
	};
	
	JTable t = null;
	JScrollPane p = null;
	
	Ex13_11_sub(){
		Container c = getContentPane();
		
		t = new JTable(data, title);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		p = new JScrollPane(t, v, h);
		c.add(p);
		
		
		super.setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Ex13_11_JTable {
	public static void main(String[] args) {
		new Ex13_11_sub();
	}
}
