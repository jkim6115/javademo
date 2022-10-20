package java014_api;

import java.util.Calendar;

/*
 *  2016년 2월 마지막일과 요일을 구하는 프로그램을 구현
 */

public class Java150_Calender {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month = 2;
		int date = 1;
		String day = "";

		cal.set(year, month - 1, date);

		int maxday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayNum = cal.get(Calendar.DAY_OF_WEEK);

		switch (dayNum) {
		case 1:
			day = "일요일";
			break;
		case 2:
			day = "월요일";
			break;
		case 3:
			day = "화요일";
			break;
		case 4:
			day = "수요일";
			break;
		case 5:
			day = "목요일";
			break;
		case 6:
			day = "금요일";
			break;
		case 7:
			day = "토요일";
			break;

		}

		System.out.printf("%d-%d-%d %s", year, month, maxday, day);
	}
}
