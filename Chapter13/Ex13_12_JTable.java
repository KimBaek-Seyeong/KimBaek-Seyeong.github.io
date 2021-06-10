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

		JFrame frame = new JFrame("참가자 명단");
		
		String[] title = {"이름","나이","성별"};
		Object[][] data= {
							{"김철수",24,'남'},
							{"이순희",21,'여'},
							{"박지영",26,'여'},
							{"손호준",31,'남'}
						};
//		char=>new Character()
		
		Container con = frame.getContentPane();
		JTable table = new JTable(data,title);
		JScrollPane sp = new JScrollPane(table);
		con.add(sp,BorderLayout.CENTER);
		
		
		JButton btn = new JButton("출력");
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
		//System.out.println("출력 클릭");
		
		int row = table.getRowCount();
		int column = table.getColumnCount();
		System.out.println(row+"줄 "+column+"칸");
		
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


