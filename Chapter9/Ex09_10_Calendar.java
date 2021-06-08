import java.util.Calendar;

public class Ex09_10_Calendar {
	public static void main(String[] args) {
		//Calendar cal = new Calendar();
		//위의 건 static class이기 때문에 바로 new Calendar()로 객체를 생성할 수 없음
		//따라서 아래처럼 특정 메소드를 활용해야 함
		
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.toString());
		//object class의 tostring은 주소값을 돌려줌
		//calendar class의 tostring은 기능을 알려줌

		System.out.print(cal.get(Calendar.YEAR)+"년");
		System.out.print(cal.get(Calendar.MONTH)+1+"월");
		System.out.println(cal.get(Calendar.DATE)+1+"일");
		
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int ap = cal.get(Calendar.AM_PM);
		if(ap == 0) {
			System.out.println("현재 시간은 am "+hour+":"+min+":"+sec);
		}else {
			System.out.println("현재 시간은 am "+hour+":"+min+":"+sec);
		}
	}
}
