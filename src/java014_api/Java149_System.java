package java014_api;

import java.util.Calendar;

public class Java149_System {
	public static void main(String[] args) {
//		Test tt = new TestExam();
//		tt.prn();
//		Test ts = Test.getInstance();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.DATE);
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY); //24시간
		int minute = cal.get(Calendar.MINUTE)+1;
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d", year, month, date, hour, minute, second);
		
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		cal.add(Calendar.DATE, -5);
		System.out.println(cal.toString());
		
		cal.set(Calendar.YEAR, 2020);
		System.out.println(cal.toString());
		
		cal.set(2017,2,1);
		System.out.println(cal.toString());
	}
}

abstract class Test {
	private static TestExam te = new TestExam();
	abstract public void prn();
	
	public static Test getInstance() {
		return te;
	}
}

class TestExam extends Test {
	@Override
	public void prn() {
		System.out.println("prn");
	}
}
