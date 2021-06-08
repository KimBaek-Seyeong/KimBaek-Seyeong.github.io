
public class Ex09_05_wrapper {
	public static void main(String[] args) {
//		Integer it1 = new Integer(11);
		Integer it1 = 11; // 11=> new Integer(11) autoboxing
		Integer it2 = 12;
		System.out.println(it1+it2);
		
		int it3 = new Integer(21);//new Integer(21) => 21
		int it4 = new Integer(22);
		System.out.println(it3 + it4);
		
		System.out.println("100"+"200"); //string to int
		int i = Integer.parseInt("100"); //same with Integer.valueOf("100")
		int j = Integer.parseInt("200");
		System.out.println(i+j);
		
		double d = Double.parseDouble("123.4");
	}
}
