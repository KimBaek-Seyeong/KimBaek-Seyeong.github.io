import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Person implements Serializable{
	String name = "ȫ�浿";
	int age = 20;
	
}

public class Ex12_07_Serializable {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		Person p = new Person();
		try {
			FileOutputStream fos = new FileOutputStream("file.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			oos.writeObject(new Date());
			
			FileInputStream fis = new FileInputStream("file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person a = (Person)ois.readObject();
			Object b = ois.readObject();
			
			System.out.println(a.name+" "+a.age);
			System.out.println(b);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				
			}
		}
	}
}
