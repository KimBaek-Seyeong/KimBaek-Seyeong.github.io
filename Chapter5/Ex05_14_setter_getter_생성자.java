class Member{
	private String id;
	private String password;
	
	Member(){
		System.out.println("member class�� ������");
		id="park";
		password="9876";
	}
	
	Member(String id, String password){
		System.out.println("Member ������(�Ű����� 2��)");
		this.id = id;
		this.password = password;
	}
/*
 ������ constructor : 
 Ŭ������ �̸��� �Ȱ��� �޼���
 ��ü��/���� �ʱ�ȭ(��ü ���� �� ȣ��) Ȥ�� �ڿ� �Ҵ��� ����ϴ� �����ƾ
 ��ü�� ������ ������ ����Ǵ� �޼ҵ�
 ���ϰ��� ������ void ������ �ʴ´�
 
 Ŭ���� ������ ������ Ȯ���� �ٷ� ���� ����Ǵ� ���� �������̰�,
 ���� �����ڿ� ���� �ʱ�ȭ�� ���� ����.
 
 default constructor : 
 �ƹ��� �����ڵ� ���� �� �ڵ����� ��������� invisible ������
 �ٸ� �����ڸ� �ۼ��� ��� �� �����ڸ� �������� �� ���� �ִ�
 */
	void setId(String id) {
		this.id = id;
	}
	void setPassword(String password) {
		this.password = password;
	}
	String getId() {
		return id;
	}
	String getPassword() {
		return password;
	}
}
public class Ex05_14_setter_getter_������ {
	public static void main(String[] args) {
		Member m = new Member();
		
		System.out.println(m.getId());
		System.out.println(m.getPassword());
		
		m.setId("test");
		m.setPassword("1234");
		System.out.println(m.getId());
		System.out.println(m.getPassword());
		
		System.out.println();
		
		Member m2 = new Member("choi", "3333");
		
	}
}
