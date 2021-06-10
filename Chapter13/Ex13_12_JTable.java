import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex13_12_JTable {
	public static void main(String[] args) {

		JFrame frame = new JFrame("������ ���");
		
		String[] title = {"�̸�","����","����"};
		Object[][] data= {
							{"��ö��",24,'��'},
							{"�̼���",21,'��'},
							{"������",26,'��'},
							{"��ȣ��",31,'��'}
						};
//		char=>new Character()
		
		Container con = frame.getContentPane();
		JTable table = new JTable(data,title);
		JScrollPane sp = new JScrollPane(table);
		con.add(sp,BorderLayout.CENTER);
		
		
		JButton btn = new JButton("���");
		con.add(btn,BorderLayout.SOUTH);
		
		btn.addActionListener(new TablePrint(table));
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400,200);
		frame.setVisible(true);
	}
} // class

class TablePrint implements ActionListener{

	JTable table;
	
	TablePrint(JTable table){
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("��� Ŭ��");
		
		int row = table.getRowCount();
		int column = table.getColumnCount();
		System.out.println(row+"�� "+column+"ĭ");
		
		String colName = table.getColumnName(0);
		System.out.println("colName:"+colName);
		
		Object obj = table.getValueAt(0, 0);
		System.out.println("obj:"+obj);
		
		
		int i,j;
		for(i=0;i<column;i++) {
			colName = table.getColumnName(i);
			System.out.print(colName+"\t");
		}
		System.out.println();
		
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				obj = table.getValueAt(i, j);
				System.out.print(obj+"\t");
			}
			System.out.println();
		}
		
	}
	
}


