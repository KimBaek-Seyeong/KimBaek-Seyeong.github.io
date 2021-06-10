import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex14_03_Server {

	public static void main(String[] args) {

		ServerSocket ss = null; // server
		Socket cs = null; // client
		
		try {
			ss = new ServerSocket(5556);
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.err.println("5556��Ʈ���� ���� �Ұ���");
			System.exit(1);
		}
		
		System.out.println("Server ready...");
		
		try {
			cs = ss.accept();
			System.out.println("Ŭ���̾�Ʈ ��������");
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("accept ����");
			System.exit(1);
		}
		
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(cs.getInputStream()));
			
			String str = br.readLine();
			System.out.println("Ŭ���̾�Ʈ���� �Ѿ�� ������:"+str);
			br.close();
			cs.close();
			ss.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}



