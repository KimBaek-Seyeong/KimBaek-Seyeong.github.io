
public class Ex04_01_1���� {

	public static void main(String[] args) {

		System.out.println("��ȣ! �迭�̴�!\n"); //�迭 : ���� �ڷ��� �������� ����
		
		int a=1, b=2, c=3, d=4, e=5;
		System.out.println(a+" "+d);
		System.out.println();
		
		int[] A= {1,2,3,4,5};
		//same with int[] A = new int[] {1,2,3,4,5};
		//same with int[] A = new int[5];
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		for(int tmp:A) { //Ȯ�� for��
			System.out.print(tmp+" ");
		}
		
	}

}
