
public class Ex03_08_����for�� {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=1;i<=3;i++) {
			for(j=5;j<=7;j++) {
				System.out.println(i+", "+j);
			}
		}
		
		System.out.println();
		
		/*
		for (i=0;i<24;i++) {
			for(j=0;j<60;j++) {
				System.out.println("������ "+i+"�� "+j+"�� �Դϴ�.");
			}
		}
		
		System.out.println();
		*/
		
		System.out.println("������ ���");
		for(i=2;i<=9;i++) {
			System.out.println("*****"+i+"��*****");
			for(j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		System.out.println("������ ���� ���");
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
