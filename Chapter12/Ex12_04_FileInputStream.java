import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex12_04_FileInputStream {
	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\coms\\Desktop\\test1.txt");

		FileInputStream fis = new FileInputStream(f); // FileNotFoundException
		FileOutputStream fos = new FileOutputStream("result.txt",true);//
//		false(default): X:货肺 积己 O:瘤快绊 货肺 积己
//		true: X:货肺 积己 O:扁粮 拳老俊 眠啊 
		
		
		while(true) {
			int str = fis.read();// IOException
			if(str == -1)
				break;
			System.out.println(str + ":" + (char)str);
			fos.write(str);
		}
		fis.close();// IOException
		fos.close();
	}
}

