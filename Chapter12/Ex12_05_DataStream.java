import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12_05_DataStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("data.txt"); //false 생략
		// fos : data.txt와의 1차 스트림(연결부분)
		DataOutputStream dos = new DataOutputStream(fos);
		// dos : data.txt와의 2차 스트림(fos와 연결)
		
		dos.write(100);
		dos.writeInt(100);
		dos.writeFloat(3.14f);
		dos.writeDouble(3.14);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream("data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		int a = dis.read();
		int b = dis.readInt();
		float c = dis.readFloat();
		double d = dis.readDouble();
		
		dis.close();
		
		System.out.println(a+","+b+","+c+","+d);
	}
}

//FileNotFoundException : 경로 일치하지 않을 때 error (fos에서는 파일 없어도 자동으로 만들어줌)