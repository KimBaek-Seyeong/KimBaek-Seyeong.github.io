import java.util.ArrayList;

public class Ex10_04_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //Integer > int ���� ū ���� (int�� ��ü�� ���� �� �ִ� Ŭ����)
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		System.out.println(list.get(1));
		
		Integer a = (Integer)list.get(1);
		System.out.println("a:"+a);
	}
}
