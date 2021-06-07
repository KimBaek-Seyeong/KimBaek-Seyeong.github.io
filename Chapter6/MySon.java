class MyFather {
	public String name;
	private String nickname; // ① private 멤버 변수는 자식 클래스에서 사용 못함

	public MyFather() {
		name = "아버지";
		nickname = "대장";
	}

	public String getNickName() {// 다른 접근제어지시자는 다되는데 private String~쓰면에러
		return nickname;
	}
}

public class MySon extends MyFather {
	MySon(){
		super(); //자식의 메소드에는 항상 부모의 매개변수 없는 기본타입 생성자를 호출
	}
	public void sayFatherNames() {
		System.out.println(name);
		//System.out.println(nickname); // MyFather의 private 멤버에 접근하므로 에러남
		/*
		 * nickname을 출력하려면 MyFather클래스안에 nickname에 접근할 수 있는 public메서드가 있어야 그 메서드를 통해서
		 * 접근할 수 있다. 또는 nickname을 public이나 protected, default(생략)로 해도 잘 나온다.
		 */
		System.out.println(getNickName());
	}

	public static void main(String[] args) {
		MySon m = new MySon();
		m.sayFatherNames();
	}
}