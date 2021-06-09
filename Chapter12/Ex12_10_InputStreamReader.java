import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_10_InputStreamReader {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//br : 읽기 위한 연결자리
		
		System.out.println("저장할 파일 이름 : ");
		try {
			String fileName = br.readLine(); //입력
			
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			//bw : 쓰기 위한 연결 자리
			
			System.out.println("파일에 저장할 내용 입력 : ");
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
