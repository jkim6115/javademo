package java015_exception;

/*
 * throws
 * 1. 예외처리를 메소드를 호출한 다른 메소드에서 하도록 전달하는 기능
 * 2. 사용목적: 발상메소드, 호출메소드에서 예외처리
 * 3. java.lang, java.net에 많이 선언되어 있음
 */

public class Java159_exception {
	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "6";

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			process(x, y);
		} catch (NumberFormatException e) {
			System.out.println(e.toString());
		}
	}

	public static void process(int x, int y) throws ArithmeticException {
//		try {
			int res = x / y;
			System.out.println(res);
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}

	}
}
