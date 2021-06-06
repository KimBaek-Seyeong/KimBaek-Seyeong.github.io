class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	Music(){
		title = "�����";
		singer = "��������, ������";
		genre = "�߶��";
		price = 2000;
	}
	Music(String title, String singer, String genre, int price){
		this.title = title;
		this.singer = singer;
		this.genre = genre;
		this.price = price;
	}
	
	void musicPrint() {
		System.out.println(singer+"�� "+genre+" ��, "+title+"��(��) "+price+"���� �Ǹŵǰ� �ֽ��ϴ�.");
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

public class Ex05_15_�輼�� {

	public static void main(String[] args) {
		
		Music m1 = new Music(); //������ ���� ����
		Music m2 = new Music("�Ѹ�", "�극�̺� �ɽ�", "��", 3000);
		Music m3 = new Music(); //setter ���� ����
		
		//���
		//m1 �� �ٷ� ����ϴ� �޼��� �����
		m1.musicPrint();
		
		//m2, m3 getter�� ���
		System.out.println(m2.getSinger()+"�� "+m2.getGenre()+" ��, "+m2.getTitle()+"��(��) "+m2.getPrice()+"���� �Ǹŵǰ� �ֽ��ϴ�.");
		System.out.println(m3.getSinger()+"�� "+m3.getGenre()+" ��, "+m3.getTitle()+"��(��) "+m3.getPrice()+"���� �Ǹŵǰ� �ֽ��ϴ�.");
		
		//��ü �迭�� ����� + ���
		Music[] arr1 = new Music[3];
		arr1[0] = new Music();
		arr1[1] = new Music("�Ѹ�", "�극�̺� �ɽ�", "��", 3000);
		arr1[2] = new Music();
		for(int i=0; i<arr1.length; i++) {
			arr1[i].display();
		}
		System.out.println();
		
		Music[] arr2 = {new Music(), new Music("�Ѹ�", "�극�̺� �ɽ�", "��", 3000), new Music()};
		for(int i=0; i<arr2.length; i++) {
			arr2[i].display();
		}
	}
}
