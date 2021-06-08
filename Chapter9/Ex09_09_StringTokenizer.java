import java.util.StringTokenizer;

public class Ex09_09_StringTokenizer {
	public static void main(String[] args) {
		String str = "1+2+3+4+5";
		String[] arr = str.split("\\+");
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println("split: "+sum);
		System.out.println();
		
		sum=0;
		StringTokenizer tmp = new StringTokenizer(str,"\\+");
		while(tmp.hasMoreTokens()) {
			String token = tmp.nextToken();
			sum += Integer.parseInt(token);
		}
		System.out.println("string tokenizer : "+sum);
	}
}
