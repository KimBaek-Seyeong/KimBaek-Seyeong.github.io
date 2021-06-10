package JTable¼ºÀû_±è¼¼¿µ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RMJTable implements ActionListener {
	JTable table;

	RMJTable(JTable table) {
		this.table = table;
	}

	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();

		DefaultTableModel tm = (DefaultTableModel) table.getModel();
		tm.removeRow(row);
	}
}
