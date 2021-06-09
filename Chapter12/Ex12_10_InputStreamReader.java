import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_10_InputStreamReader {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//br : �б� ���� �����ڸ�
		
		System.out.println("������ ���� �̸� : ");
		try {
			String fileName = br.readLine(); //�Է�
			
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			//bw : ���� ���� ���� �ڸ�
			
			System.out.println("���Ͽ� ������ ���� �Է� : ");
			String contents = br.readLine();
			while((contents=br.readLine())!= null) {
				bw.write(contents);
				bw.newLine();
			}
			
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
