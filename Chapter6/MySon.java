class MyFather {
	public String name;
	private String nickname; // �� private ��� ������ �ڽ� Ŭ�������� ��� ����

	public MyFather() {
		name = "�ƹ���";
		nickname = "����";
	}

	public String getNickName() {// �ٸ� �������������ڴ� �ٵǴµ� private String~���鿡��
		return nickname;
	}
}

public class MySon extends MyFather {
	MySon(){
		super(); //�ڽ��� �޼ҵ忡�� �׻� �θ��� �Ű����� ���� �⺻Ÿ�� �����ڸ� ȣ��
	}
	public void sayFatherNames() {
		System.out.println(name);
		//System.out.println(nickname); // MyFather�� private ����� �����ϹǷ� ������
		/*
		 * nickname�� ����Ϸ��� MyFatherŬ�����ȿ� nickname�� ������ �� �ִ� public�޼��尡 �־�� �� �޼��带 ���ؼ�
		 * ������ �� �ִ�. �Ǵ� nickname�� public�̳� protected, default(����)�� �ص� �� ���´�.
		 */
		System.out.println(getNickName());
	}

	public static void main(String[] args) {
		MySon m = new MySon();
		m.sayFatherNames();
	}
}