import java.util.ArrayList;
import java.util.Scanner;

public class Ex10_03_ArrayList { //�߿�!
	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>(); //�����迭 //�÷����� �� ����
		System.out.println(s.size());
		
		s.add("����");
		s.add("����");
		s.add("ȿ��");
		s.add("����"); //�ߺ� ���, ���� ����
		
		System.out.println(s.size());
		System.out.println("s: "+s);
		System.out.println(s.get(1));
		
		s.add(2, "�¿�");
		System.out.println(s.get(2));
		System.out.println("s: "+s);
		
		ArrayList<String> revel = new ArrayList<String>();
		revel.add("����");
		revel.add("����");
		System.out.println(revel);
		s.addAll(revel);
		System.out.println("s:"+s);
		System.out.println(s.size());
		
		s.remove(2);
		System.out.println("s:"+s);
//		s.remove("����");
		ArrayList<String> remove = new ArrayList<String>();
		remove.add("����");
		s.removeAll(remove);
		System.out.println("s:"+s);
		
		s.set(1, "���");
		System.out.println("s:"+s);
		
		s.add(1, "����");
		System.out.println("s:"+s);
		
		int pos = s.indexOf("����");
		System.out.println(pos);
		
		int lastpos = s.lastIndexOf("����");
		System.out.println(lastpos);
		
		boolean res = s.contains("����");
		System.out.println(res);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		if (s.indexOf(name) != -1) {
			System.out.println("������ ȸ���Դϴ�.");
		}else {
			System.out.println("�������� ���� ȸ���Դϴ�.");
		}
		
		int count=0;
		for(int i=0; i<s.size(); i++) {
			if (s.get(i).equals(name)) count++;
		}
		if (count != 0) System.out.println("������ ȸ���Դϴ�.");
		else System.out.println("�������� ���� ȸ���Դϴ�.");
	}
}
