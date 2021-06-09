import java.util.ArrayList;
import java.util.Scanner;

class Person{
	private String id;
	private String pw;
	
	Person(){
		
	}
	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String toString() {
		return id+"/"+pw;
	}
	
}

public class Ex10_05_ArrayList {
	public static void main(String[] args) {
		Person p1 = new Person("kim", "1234");
		Person p2 = new Person("park", "3333");
		Person p3 = new Person("lee", "7777");
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(new Person("lee", "7777"));
		
		System.out.println(list.toString()); //person�� �޼ҵ尡 ���ٸ� �ּҰ��� ������ ��
		System.out.println();
		
		ArrayList<Person> list2 = new ArrayList<Person>();
		Person[] arr = {p1, p2, p3};
		for (int i=0; i<arr.length; i++) {
			list2.add(arr[i]);
		}
		System.out.println(list2);
		
		ArrayList<Person> l3 = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("id �Է� : ");
			String id = sc.next();
			
			System.out.print("pw �Է� : ");
			String pw = sc.next();
			
			Person p = new Person(id, pw);
			l3.add(p);
			System.out.print("��� �Ͻðڽ��ϱ�?");
			String answer = sc.next();
			if (answer.equals("n")) break;
		}
		
		System.out.println(l3);
		int i;
		for(i=0; i<l3.size(); i++) {
			Person per = l3.get(i);
			System.out.println(per);
			System.out.println(per.getId());
			System.out.println(per.getPw());
		}
	}
}




