import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12_05_DataStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("data.txt"); //false ����
		// fos : data.txt���� 1�� ��Ʈ��(����κ�)
		DataOutputStream dos = new DataOutputStream(fos);
		// dos : data.txt���� 2�� ��Ʈ��(fos�� ����)
		
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

//FileNotFoundException : ��� ��ġ���� ���� �� error (fos������ ���� ��� �ڵ����� �������)