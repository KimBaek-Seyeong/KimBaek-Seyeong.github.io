import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_11_Date {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("now : "+now.toString());
		
		System.out.println(now.getYear()+1900); //������ 1900��
		System.out.println(now.getMonth()+1);
		System.out.println(now.getDate());
		System.out.println(now.getDay());
		String[] week = {"��","��","ȭ","��","��","��","��"};
		System.out.println(week[now.getDay()]+"����");
		System.out.println(now.getHours());
		System.out.println(now.getMinutes());
		System.out.println(now.getSeconds());
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("YY-MM-d�� E");
		System.out.println(sdf.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss E����");
		System.out.println(sdf2.format(now));
	}
}
