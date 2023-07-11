import java.util.Calendar;

public class EnumWeekTest01 {

	public static void main(String[] args) {
		Week today =null;
		Calendar c =Calendar.getInstance();// 추상 클래스로 new로 객체 생성을 못한다. 년월일시분
		//초값을 반환할 때 많이 사용
		int week =c.get(Calendar.DAY_OF_WEEK); //일요일 1~ 토요일이 7로 반환
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.Monday; break;
		case 3: today = Week.Tuesday; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.Thursday; break;
		case 6: today = Week.Friday; break;
		case 7: today = Week.Saturday; 
		}
		System.out.println(today);
		if(today == Week.Monday) {
			System.out.println("오늘은 쉬는날이다.");
		}
		else {
			System.out.println("자바 공부를한다");
		}
	}

}
