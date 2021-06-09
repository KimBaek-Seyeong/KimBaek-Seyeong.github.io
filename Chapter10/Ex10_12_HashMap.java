import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex10_12_HashMap {
	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<String,Integer>(); // key,value
		System.out.println(hm.size());
		
		hm.put("��",89);
		hm.put("����",35);
		hm.put("����",78);
		hm.put("����",92);
		hm.put("����",89);
		
		System.out.println(hm.size());
		System.out.println("hm:"+hm);
		
		System.out.println(hm.get("����"));
		Integer jumsu = hm.get("����"); // get(key)
		System.out.println(jumsu);
		
		System.out.println(hm.get("RM"));//null
		System.out.println(hm.get(78));//null
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�:");
		String name = sc.next();
		if(hm.get(name) != null) {
			System.out.println(name+"�� ������ "+hm.get(name)+"�� �Դϴ�.");
		}
		else {
			System.out.println("��ϵ��� ���� �̸��Դϴ�.");
		}
		
		System.out.println(hm.containsKey("����"));
		System.out.println(hm.containsKey("����ȩ"));
		
		System.out.println(hm.containsValue("����"));
		System.out.println(hm.containsValue(92));
		
		Set<String> key = hm.keySet();
		System.out.println("key:"+key);
		
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k+":"+hm.get(k));
		}
		
		hm.remove("����");
		System.out.println("hm: "+hm);
	}
}
/*
Map
key,value ������ ����
����X
key:�ߺ� ���X
value:�ߺ� ���O
*/





