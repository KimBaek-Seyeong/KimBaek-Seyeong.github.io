class Member{
	private String id;
	private String password;
	
	Member(){
		System.out.println("member class의 생성자");
		id="park";
		password="9876";
	}
	
	Member(String id, String password){
		System.out.println("Member 생성자(매개변수 2개)");
		this.id = id;
		this.password = password;
	}
/*
 생성자 constructor : 
 클래스와 이름이 똑같은 메서드
 객체의/변수 초기화(객체 생성 시 호출) 혹은 자원 할당을 담당하는 서브루틴
 객체가 생성될 때마다 실행되는 메소드
 리턴값이 없지만 void 붙이지 않는다
 
 클래스 변수의 공간이 확보된 바로 이후 실행되는 것이 생성자이고,
 따라서 생성자에 변수 초기화를 자주 진행.
 
 default constructor : 
 아무런 생성자도 없을 때 자동으로 만들어지는 invisible 생성자
 다른 생성자를 작성할 경우 빈 생성자를 만들어줘야 할 수도 있다
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
public class Ex05_14_setter_getter_생성자 {
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
