package JTable성적_김세영;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddJTable implements ActionListener {
	JTable table;
	JTextField[] field = new JTextField[4];

	AddJTable(JTable table, JTextField[] field) {
		this.table = table;
		for (int i = 0; i < field.length; i++) {
			this.field[i] = field[i];
		}
	}

	public void actionPerformed(ActionEvent e) {
//		String s = field[0].getText();
		String[] s = new String[4];
		for (int i = 0; i < field.length; i++) {
			s[i] = field[i].getText();
		}
//		table.getModel() => TableModel => 자식클래스 DefaultTableModel의 method인 addRow()
		DefaultTableModel tm = (DefaultTableModel) table.getModel();
		tm.addRow(s);

		for (int i = 0; i < field.length; i++) {
			field[i].setText("");
		}
		field[0].requestFocus();
	}
}
