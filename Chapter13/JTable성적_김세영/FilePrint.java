package JTable己利_辫技康;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTable;

public class FilePrint implements ActionListener {
	JTable table;
	BufferedWriter bw = null;

	FilePrint(JTable table) {
		this.table = table;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			bw = new BufferedWriter(new FileWriter("src/JTable己利_辫技康/score_write.txt"));
			int row = table.getRowCount();
			int column = table.getColumnCount();

			String colName = table.getColumnName(0);
			Object obj = table.getValueAt(0, 0);

			int i, j;
			for (i = 0; i < column; i++) {
				colName = table.getColumnName(i);
				if (i + 1 == column) {
					bw.write(colName + "");
				} else {
					bw.write(colName + "/");
				}
			}
			bw.newLine();

			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					obj = table.getValueAt(i, j);
					if (j + 1 == column) {
						bw.write(obj + "");
					} else {
						bw.write(obj + "/");
					}
				}
				bw.newLine();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
