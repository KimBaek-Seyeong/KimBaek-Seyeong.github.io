import java.util.Date;
//import java.lang.String; //default import package, ���� ����

public class Ex07_01_Error {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("d : "+d);
		
		String str = "apple";
		int len = str.length(); //�迭���� ����� length�� �޼��� �ƴ�
								//�� ���ο��� ����� �� ������ ��ȯ�ϴ� �޼���
		System.out.println("len : "+len);
		System.out.println();
		
//		String str2 = null; //���� ��, NullPointerException
		//���ܰ� �߻��ϸ� ���� ��ü�� �ڵ����� �����ȴ�
		String str2 = "";
		len = str2.length();
		System.out.println("len : "+len);
		System.out.println();
		
		int[] arr = {1,2,3};
		int i;
		
		try {
			for(i=0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			System.out.println(3/0);
//		}catch(NullPointerException npe){
//			System.out.println("���� �߻�");
//		}catch(ArrayIndexOutOfBoundsException aoe) {
//			System.out.println("�ε��� �ʰ�");
//		}catch(ArithmeticException ae) {
//			System.out.println("0���� ������");
		}catch(Exception e) {
			System.out.println("��� ���� ó��");
		}
	}
}
