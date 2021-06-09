import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex12_12_�輼�� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false; //�ܾ� �ֳ���? ����
		String str, line; //str : �ܾ�/�� �Է�, line : ���� �� ���� �б�
		String[] token = null; //line���� ���� ���ڿ� �ܾ� ������ ���� ����(0�� ���� �ܾ�, 1�� �ѱ� ��)
		int menu; //���� �޴� ����?

		System.out.println("���� �ܾ��� ���α׷��� �����մϴ�.");
		while (true) {
			System.out.print("1.�ܾ��Է�  2.�ܾ�˻�  3.����  : ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("�ܾ�/�� �������� �Է��ϼ��� : ");
				br = new BufferedReader(new InputStreamReader(System.in)); //scanner�� �ٸ��� ���� �Է� ����
				str = br.readLine();

				bw = new BufferedWriter(new FileWriter("dictionary.txt", true));
				bw.write(str);
				bw.newLine();
				bw.close(); // ����
				break;

			case 2:
				System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
				br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				br = new BufferedReader(new FileReader("dictionary.txt"));

				while ((line = br.readLine()) != null) {
					flag = false;
					token = line.split("/");

					if (token[0].equalsIgnoreCase(str)) {
						System.out.println("�Է��� �ܾ��� ���� " + token[1] + "�Դϴ�.");
						flag = true;
						break;
					}
				}

				if (!flag) {
					System.out.println("ã�� �ܾ� ����");
				}
				System.out.println();
				break;

			case 3:
				System.out.println("���α׷� �����մϴ�.");
				br.close(); //���� //br�� case1���� ����
				System.exit(0);
			}
		}
	}
}
