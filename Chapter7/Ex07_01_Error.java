import java.util.Date;
//import java.lang.String; //default import package, 생략 가능

public class Ex07_01_Error {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("d : "+d);
		
		String str = "apple";
		int len = str.length(); //배열에서 사용한 length는 메서드 아님
								//이 라인에서 사용한 건 개수를 반환하는 메서드
		System.out.println("len : "+len);
		System.out.println();
		
//		String str2 = null; //에러 뜸, NullPointerException
		//예외가 발생하면 예외 객체가 자동으로 생성된다
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
//			System.out.println("에러 발생");
//		}catch(ArrayIndexOutOfBoundsException aoe) {
//			System.out.println("인덱스 초과");
//		}catch(ArithmeticException ae) {
//			System.out.println("0으로 나눴음");
		}catch(Exception e) {
			System.out.println("모든 예외 처리");
		}
	}
}
