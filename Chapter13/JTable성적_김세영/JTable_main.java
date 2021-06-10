package JTable성적_김세영;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JTable_main extends JFrame implements ActionListener {
	Vector<String> title = null;
	Vector<Vector<String>> data = null;
	Container con = null;
	JTable table = null;
	JScrollPane pane = null;
	JButton b1, b2, b3, b4;
	JTextField[] field = new JTextField[4];
	String[] caption = { "이름 : ", "국어 : ", "수학 : ", "영어 : " };
	int count = 1;

	JTable_main(String str) {
		super(str);
		title = new Vector<String>();
		data = new Vector<Vector<String>>();

		getReadFile();
		display();

		b1.addActionListener(new AddJTable(table, field));
		b2.addActionListener(new RMJTable(table));
		b3.addActionListener(new FilePrint(table));
		b4.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 300);
		setVisible(true);
		setResizable(false);
	}

	public void getReadFile() {
		try {
			FileReader fr = new FileReader("src/JTable성적_김세영/score2.txt");
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				String[] token = line.split("/");

				if (count++ == 1) {
					for (int i = 0; i < token.length; i++) {
						title.add(token[i]);
					}
				} else {
					Vector<String> stepOne = new Vector<String>();
					for (int i = 0; i < token.length; i++) {
						stepOne.add(token[i]);
					}
					data.add(stepOne);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void display() {
		con = getContentPane();
		con.setLayout(null);

		table = new JTable(data, title);
		pane = new JScrollPane(table);
		con.add(pane);
		pane.setBounds(250, 30, 400, 200);

		for (int i = 0; i < 4; i++) {
			JLabel label = new JLabel();
			label.setText(caption[i]);
			label.setBounds(25, (i + 1) * 33, 50, 20);
			con.add(label);

			field[i] = new JTextField();
			field[i].setBounds(95, (i + 1) * 33, 100, 20);
			con.add(field[i]);
		}

		b1 = new JButton("추가");
		b2 = new JButton("삭제");
		b3 = new JButton("파일출력");
		b4 = new JButton("종료");

		b1.setBounds(20, 180, 100, 20);
		b2.setBounds(130, 180, 100, 20);
		b3.setBounds(20, 210, 100, 20);
		b4.setBounds(130, 210, 100, 20);

		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("프로그램 종료");
		System.exit(0);
	}

	public static void main(String[] args) {
		new JTable_main("성적 처리 프로그램");
	}
}
