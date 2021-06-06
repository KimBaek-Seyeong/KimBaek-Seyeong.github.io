class Stu{
	private String name;
	private int kor, eng;
	
	Stu(){
		name = "태연";
		kor = 90;
		eng = 100;
	}
	Stu(String name){
		this.name = name;
		kor = 30;
		eng = 40;
	}
	Stu(String name, int kor){
		this.name = name;
		this.kor = kor;
		eng = 60;
	}
	
	void display() {
		System.out.println(name + ","+kor+","+eng);
	}
}

public class Ex05_16_객체배열 {

	public static void main(String[] args) {
		
		Stu s1 = new Stu();
		Stu s2 = new Stu("서현");
		Stu s3 = new Stu("수영", 33);
		
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println();
		int a=10, b=20, c=30;
		
		int[] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		int[] arr2 = {a, b, c};
		int[] arr3 = new int[] {a, b, c};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		Stu[] arrS1 = new Stu[3];
		arrS1[0] = new Stu();
		arrS1[1] = new Stu("서현");
		arrS1[2] = new Stu("수영", 33);
		
		for(int i=0; i<arrS1.length; i++) {
			arrS1[i].display();
		}
		
		System.out.println();
		
		Stu[] arrS2 = {new Stu(), new Stu("서현"), new Stu("수영", 33)};
		for(int i=0; i<arrS2.length; i++) {
			arrS2[i].display();
		}
		
	}
}
