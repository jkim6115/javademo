package java014_api;

import java.util.Calendar;

public class Java151_Calender {
	public static void main(String[] args) {
		Calendar examCal = Calendar.getInstance();
		int examYear = 2022;
		int examMonth = 11;
		int examDate = 17;

		examCal.set(examYear, examMonth-1, examDate);
		System.out.println(examCal.toString());

		Calendar today = Calendar.getInstance();
		System.out.println(today);

		long eventday = examCal.getTimeInMillis();
		long nowDay = today.getTimeInMillis();
		System.out.println("eventDay: " + eventday);
		System.out.println("nowDay:" + today);

		long endDay = (eventday - nowDay) / (1000 * 60 * 60 * 24);
		System.out.println(endDay);
	}
}
