package java015_exception;

public class Java156_exception {
	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "0";

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x / y;
			System.out.println(res);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (NumberFormatException e) {
			System.out.println(e.toString());
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		}
	}
}
