//abstract class Copymachine{
//	abstract void copy();
//}

interface Copymachine{
	int a=3;
	void copy();
}

interface Printmachine{
	void print();
}

interface Faxmachine{
	void fax();
}

class Compound implements Copymachine,Printmachine,Faxmachine{

	@Override
	public void print() {
		System.out.println("프린트한다.");
	}

	@Override
	public void copy() {
		System.out.println("복사한다.");
	}

	@Override
	public void fax() {
		System.out.println("팩스보낸다.");
	}
}

public class Ex06_12_interface {
	public static void main(String[] args) {

		Compound com = new Compound();
		com.copy();
		com.fax();
		com.print();
		
		Faxmachine f = new Compound();
		f.fax();
	}

}