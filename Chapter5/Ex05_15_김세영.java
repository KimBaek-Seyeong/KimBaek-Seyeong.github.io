class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "고양이";
		singer = "선우정아, 아이유";
		genre = "발라드";
		price = 2000;
	}
	Music(String title, String singer, String genre, int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	void musicPrint() {
		System.out.println(singer+"의 "+genre+" 곡, "+title+"은(는) "+price+"원에 판매되고 있습니다.");
	}
	void display() {
		System.out.println(title+","+singer+","+genre+","+price);
	}
	
	String getTitle() {
		return title;
	}
	String getSinger() {
		return singer;
	}
	String getGenre() {
		return genre;
	}
	int getPrice() {
		return price;
	}
}

public class Ex05_15_김세영 {

	public static void main(String[] args) {
		
		Music m1 = new Music(); //생성자 통한 주입
		Music m2 = new Music("롤린", "브레이브 걸스", "댄스", 3000);
		Music m3 = new Music(); //setter 통한 주입
		
		//출력
		//m1 한 줄로 출력하는 메서드 만들기
		m1.musicPrint();
		
		//m2, m3 getter로 출력
		System.out.println(m2.getSinger()+"의 "+m2.getGenre()+" 곡, "+m2.getTitle()+"은(는) "+m2.getPrice()+"원에 판매되고 있습니다.");
		System.out.println(m3.getSinger()+"의 "+m3.getGenre()+" 곡, "+m3.getTitle()+"은(는) "+m3.getPrice()+"원에 판매되고 있습니다.");
		
		//객체 배열로 만들기 + 출력
		Music[] arr1 = new Music[3];
		arr1[0] = new Music();
		arr1[1] = new Music("롤린", "브레이브 걸스", "댄스", 3000);
		arr1[2] = new Music();
		for(int i=0; i<arr1.length; i++) {
			arr1[i].display();
		}
		System.out.println();
		
		Music[] arr2 = {new Music(), new Music("롤린", "브레이브 걸스", "댄스", 3000), new Music()};
		for(int i=0; i<arr2.length; i++) {
			arr2[i].display();
		}
	}
}
