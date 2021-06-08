
public class Ex09_06_wrapper {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		String[] str = {"1", "2", "3", "4", "5"};
		
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i=0; i<str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		System.out.println(sum);
		
		String[] str2 = {"아이유:30", "웬디:90", "크리스탈:70"};
		//:의 위치 indexOf
		//일부를 가져오기 substring
		String[] score = new String[3];
		int num2=0, sum2=0;
		for(int i=0; i<str2.length; i++) {
			num2 = str2[i].indexOf(":");
			score[i] = str2[i].substring(num2+1);
			System.out.println(score[i]);
			num2 = Integer.parseInt(score[i]);
			sum2 += num2;
		}
		System.out.println(sum2);
	}
}
