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
			System.err.println("5556포트에는 연결 불가능");
			System.exit(1);
		}
		
		System.out.println("Server ready...");
		
		try {
			cs = ss.accept();
			System.out.println("클라이언트 접속했음");
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("accept 실패");
			System.exit(1);
		}
		
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(cs.getInputStream()));
			
			String str = br.readLine();
			System.out.println("클라이언트에서 넘어온 데이터:"+str);
			br.close();
			cs.close();
			ss.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}



