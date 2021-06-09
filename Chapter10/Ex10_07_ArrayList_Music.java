import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;
	public Music(String title, String singer, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		//return "Music [title=" + title + ", singer=" + singer + ", price=" + price + "]";
		return title+"/"+singer+"/"+price;
	}
}
public class Ex10_07_ArrayList_Music {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String retry,title,singer, search_title;
		int price, i;
		ArrayList<Music> list = new ArrayList<Music>();
		while(true) {
			System.out.print("제목:");
			title = sc.next();
			
			System.out.print("가수명:");
			singer = sc.next();
			
			System.out.print("가격:");
			price = sc.nextInt();
			
			Music m = new Music(title,singer,price);
			list.add(m);
			
			System.out.print("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}
		
		System.out.println("list:"+list);
		
		for(i=0;i<list.size();i++) {
			Music music = list.get(i);
			System.out.println("music:" + music);
		}
		
		for( Music a : list) {
			System.out.println(a);
		}
		
		System.out.println();
		boolean flag = false;
		while(true) {
			flag = false;
			System.out.print("찾는 제목 입력:");
			search_title = sc.next(); // c  d=>찾는 제목은 없습니다.
			for(i=0;i<list.size();i++) {
				Music music = list.get(i);
				String mtitle = music.getTitle();
				if(mtitle.equals(search_title)) {
					System.out.println(search_title+"의 가수명은 "+music.getSinger());
					flag = true;
				}
//				else {
//					System.out.println("찾는 제목이 없습니다.");
//				}
			}
			
			if(flag == false) {
				System.out.println("찾는 제목이 없습니다.");
			}
			
			System.out.print("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}







