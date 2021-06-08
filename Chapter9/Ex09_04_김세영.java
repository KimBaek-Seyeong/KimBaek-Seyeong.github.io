import java.util.Scanner;

class Person{
	String id;
	String pw;
	String name;
	
	Person(){
		
	}
	Person(String id, String pw, String name){
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
public class Ex09_04_김세영 {
	public static void main(String[] args) {
		//Person 객체 3개 배열로 생성
		Person[] arr = {new Person("maratang", "1234", "마라탕"),
				new Person("marapasta", "5678", "마라파스타"),
				new Person("mararamen", "9012", "마라라면")};
		
		Scanner sc = new Scanner(System.in);
		String id, pw, name, answer;
		boolean b=false;	int i;
		
		while(true) {
			//Scanner -> id pw 입력 (system in)
			System.out.print("id 입력 : ");
			id = sc.next();
			System.out.print("pw 입력 : ");
			pw = sc.next();
			
			//객체 배열에 id 값 존재?
			for (i=0; i<arr.length; i++) {
				if (arr[i].id.equals(id)) {
					b = true; //있으면 true
				}
			}
			
			if (b!=true) { //입력한 id 데이터가 존재하지 않으면
				System.out.println("해당 아이디가 없습니다.");
			}else {
				b=false;
				for (i=0; i<arr.length; i++) {
					if (arr[i].pw.equals(pw)) {
						b = true; //id와 pw 입력값이 모두 true면
						System.out.println(arr[i].name+" 님, 반갑습니다.");
					}
				}
				if (b!=true) { //입력한 pw 데이터가 존재하지 않으면
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}
			
			System.out.print("계속? ");
			answer = sc.next();

			if("n".equals(answer)) {
				break;
			}
		}
	}
}
