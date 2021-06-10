import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ex14_02_IPTest {
	public static void main(String[] args) {
		System.out.print("웹 사이트 주소 입력 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String url = br.readLine();
			InetAddress[] address = InetAddress.getAllByName(url);

			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
