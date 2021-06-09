import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	
	public Card(){
		
	}
	public Card(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return name + "\t" + tel;
	}
	
	
	
}
public class Ex10_08_김세영 {
	public static void main(String[] args) {

		int num;
		String name, phone;
		boolean button=true, youThere=false;
		
		ArrayList<Card> c = new ArrayList<Card>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("프로그램을 시작합니다.");
		while(button) {
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			System.out.print("원하는 메뉴 번호 입력 : ");
			num = sc.nextInt();
			
			if (num == 1) {
				System.out.print("이름을 입력하세요 : ");
				name = sc.next();
				System.out.print("전화 번호를 입력하세요 : ");
				phone = sc.next();
				
				//Card 배열에 저장
				Card p = new Card(name, phone);
				c.add(p);
				
				System.out.println("추가 되었습니다.\n");				
			} else if (num == 2) {
				System.out.print("이름을 입력하세요 : ");
				name = sc.next();
				
				//이름을 가진 값이 arraylist에 없으면 "이름을 잘못 입력하셨습니다."
				for (int i=0; i<c.size(); i++) {					
					if (c.get(i).getName().equals(name)) {
						youThere = true;
						c.remove(i);
						System.out.println("삭제 되었습니다.\n");
					}
				}
				
				if(youThere != true) {
					System.out.println("이름을 잘못 입력하셨습니다.\n");
				}
				
			} else if (num == 3) {
				System.out.print("이름을 입력하세요 : ");
				name = sc.next();
				System.out.print("수정할 전화 번호를 입력하세요 : ");
				phone = sc.next();
				Card p = new Card(name, phone);
				
				//이름을 가진 값이 arraylist에 없으면 "이름을 잘못 입력하셨습니다."
				for (int i=0; i<c.size(); i++) {
					if (c.get(i).getName().equals(name)) {
						youThere = true;
						c.set(i, p);
						System.out.println("수정 되었습니다.\n");
					}
				}
				
				if(youThere != true) {
					System.out.println("이름을 잘못 입력하셨습니다.");
				}
			} else if (num == 4) {
				System.out.println("이름\t전화번호");
				
				for (int i=0; i<c.size(); i++) {
					Card tmp = c.get(i);
					System.out.println(tmp);
				}
				
				System.out.println();
			} else if (num == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.\n");
			}
		}
	}
}


