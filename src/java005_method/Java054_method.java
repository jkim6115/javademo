package java005_method;

public class Java054_method {
	public static void main(String[] args) {
		int year = 2013;
		boolean result = isLeapYear(year);
		if(result) {
			System.out.printf("%d년도는 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년도는 평년입니다.\n", year);
		}
		
	}
	
	public static boolean isLeapYear(int year) {
		boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		
		if(leapYear) {
			return true;
		} else {
			return false;
		}
	}
}
