import java.util.Calendar;

public class Ex09_10_Calendar {
	public static void main(String[] args) {
		//Calendar cal = new Calendar();
		//���� �� static class�̱� ������ �ٷ� new Calendar()�� ��ü�� ������ �� ����
		//���� �Ʒ�ó�� Ư�� �޼ҵ带 Ȱ���ؾ� ��
		
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.toString());
		//object class�� tostring�� �ּҰ��� ������
		//calendar class�� tostring�� ����� �˷���

		System.out.print(cal.get(Calendar.YEAR)+"��");
		System.out.print(cal.get(Calendar.MONTH)+1+"��");
		System.out.println(cal.get(Calendar.DATE)+1+"��");
		
		String[] week = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)]+"����");
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int ap = cal.get(Calendar.AM_PM);
		if(ap == 0) {
			System.out.println("���� �ð��� am "+hour+":"+min+":"+sec);
		}else {
			System.out.println("���� �ð��� am "+hour+":"+min+":"+sec);
		}
	}
}
