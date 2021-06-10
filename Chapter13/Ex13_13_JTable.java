import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class Ex13_13_sub extends JFrame {
	JTable t = null;
	JScrollPane p = null;
	Container con = null;
	int c = 1;
	
	Vector<String> title = null;
	Vector<Vector<String>> data = null;
	
	Ex13_13_sub() {
		title = new Vector<String>();
		data = new Vector<Vector<String>>();
		JButton b = new JButton("출력");
		
		getReadFile();
		makeJTable();
		
		con.add(b, BorderLayout.SOUTH);
		b.addActionListener(new ButtonPrint(t));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setResizable(false);
		setVisible(true);
	}

	private void getReadFile() {
		try {
			FileReader fr = new FileReader("score.txt");
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				String[] item = line.split("/");
				if(c++ == 1) {
					for(int i=0; i<item.length; i++) {
						title.add(item[i]);
					}
				} else {
					Vector<String> first = new Vector<String>();
					for(int i=0; i<item.length; i++) {
						first.add(item[i]);
					}
					data.add(first);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void makeJTable() {
		con = getContentPane();
		t = new JTable(data, title);
		p = new JScrollPane(t);
		con.add(p, BorderLayout.CENTER);		
	}
	
	class ButtonPrint implements ActionListener{
		JTable t;
		
		ButtonPrint(JTable t){
			this.t = t;
		}
		
		public void actionPerformed(ActionEvent e) { //암기
			int row = t.getRowCount();
			int column = t.getColumnCount();
			
			String colName = t.getColumnName(0);
			Object obj = t.getValueAt(0, 0);
			
			int i,j;
			for(i=0;i<column;i++) {
				colName = t.getColumnName(i);
				System.out.print(colName+"\t");
			}
			System.out.println();
			
			for(i=0;i<row;i++) {
				for(j=0;j<column;j++) {
					obj = t.getValueAt(i, j);
					System.out.print(obj+"\t");
				}
				System.out.println();
			}
		}
		
	}
}

public class Ex13_13_JTable {
	public static void main(String[] args) {
		new Ex13_13_sub();
		try {
			FileReader fr = new FileReader("score.txt");
			BufferedReader br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
