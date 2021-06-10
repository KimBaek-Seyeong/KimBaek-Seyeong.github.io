import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex14_03_Client {
	public static void main(String[] args) {

		Socket cs = null;
		PrintWriter pw = null;
		try {
			cs = new Socket("localhost",5556);
			
			pw = new PrintWriter(cs.getOutputStream());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Ű����=>�ѱ�=>���鵵 ����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("���� �Է�:");
		try {
			String str = br.readLine(); // �ȳ��ϼ���
			System.out.println("Ŭ���̾�Ʈ:"+str);
			
			pw.println(str);
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}