package ncs.test03;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar birthDay = Calendar.getInstance();
		int currentYear = today.get(Calendar.YEAR);
		int currentMonth = today.get(Calendar.MONDAY)+1;
		int currentDay = today.get(Calendar.DAY_OF_MONTH);
		
		int birthYear = 1987;
		int birthMonth = 5 - 1;
		int birthDate = 27;

		String day = "" ;
		birthDay.set(Calendar.YEAR, birthYear);
		birthDay.set(Calendar.MONTH, birthMonth);
		birthDay.set(Calendar.DATE, birthDate);
		int dayNum = birthDay.get(Calendar.DAY_OF_WEEK) ;
		
		switch(dayNum){
		case 1:
			day = "일";
			break ;
		case 2:
			day = "월";
			break ;
		case 3:
			day = "화";
			break ;
		case 4:
			day = "수";
			break ;
		case 5:
			day = "목";
			break ;
		case 6:
			day = "금";
			break ;
		case 7:
			day = "토";
			break ;
			
	}
		
		int age = currentYear - birthYear;
		
		System.out.printf("생일 : %d년 %d월 %d일 %s요일\n", birthYear, birthMonth, birthDate, day);
		System.out.printf("현재 : %d년 %d월 %d일\n", currentYear, currentMonth, currentDay);
		System.out.printf("나이 : %d 세",age);
	}
}
