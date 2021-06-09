import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12_06_BufferedStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fos = new FileOutputStream("test.txt");
			bos = new BufferedOutputStream(fos, 5);
			//6번째 데이터가 들어오면 bos안의 데이터가 fos로 넘어감
			
			for(int i=1; i<9; i++) {
				bos.write(i+48);
			}
			bos.flush();
			
			fis = new FileInputStream("test.txt");
			bis = new BufferedInputStream(fis);
			
			int c;
			while((c = bis.read()) != -1) {
				System.out.print((char)c+" ");
			}
			System.out.println();
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

//ASCII code
//0 : 48
//A : 65
//a : 97