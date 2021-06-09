class Horizontal extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("-");
			if(i%50==0)
				System.out.println();
		}
	}
}

class Vertical extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("|");
			if(i%50==0)
				System.out.println();
		}
	}
}
public class Ex11_06_¿ì¼±¼øÀ§ {
	public static void main(String[] args) {

		Horizontal h = new Horizontal();
		
		Vertical v = new Vertical();
		
		System.out.println(h.getName());
		System.out.println(v.getName());
		
		h.setName("Ã¶¼ö");
		v.setName("À±¾Æ");
		System.out.println(h.getName());
		System.out.println(v.getName());

		System.out.println("h.getPriority():"+h.getPriority());
		System.out.println("v.getPriority():"+v.getPriority());
		
		v.setPriority(7);
		h.start();
		v.start();
	}
}





