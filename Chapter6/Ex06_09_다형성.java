class Robot {

}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("��̰� ���� �߸鼭~");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("��̰� �뷡 �ϸ鼭~");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("��̰� �׸� �׸���~");
	}
}

public class Ex06_09_������ {
	public static void main(String[] args) {
		DanceRobot da = new DanceRobot();
		SingRobot si = new SingRobot();
		DrawRobot dr = new DrawRobot();
		da.dance();
		si.sing();
		dr.draw();

		System.out.println();

		// �ڽ� Ŭ������ �θ� Ŭ������ ������ �� �ִ�
		Robot da2 = new DanceRobot(); // �θ� �޼ҵ尡 ��� ������
		Robot si2 = new SingRobot();
		Robot dr2 = new DrawRobot();
//		da2.dance();
//		si2.sing();
//		dr2.draw();

//		Robot[] arr = new Robot[3];
//		arr[0] = new DanceRobot();
//		arr[1] = new SingRobot();
//		arr[2] = new DrawRobot();
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		int i;
		for (i = 0; i < arr.length; i++) {
			action(arr[i]); // DanceRobot, SingRobot, DrawRobot �����ּ�
		}
	}//main

	static void action(Robot r) {
		// r.dance();
		if (r instanceof DanceRobot) {
			DanceRobot da = (DanceRobot) r;
			da.dance();
		} else if (r instanceof SingRobot) {
			// r.sing();
			SingRobot si = (SingRobot) r;
			si.sing();
		} else if (r instanceof DrawRobot) {
			// r.draw();
			DrawRobot dr = (DrawRobot) r;
			dr.draw();
		}
	}//action
}//class(���� Ŭ����)
