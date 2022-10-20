package java015_exception;

public class Java155_exception {
	public static void main(String[] args) {
		StringBuffer sb = null;

		try {
			sb.reverse();
		} catch (NullPointerException e) {
			sb = new StringBuffer("java");
			System.out.println(sb);
		} finally {
			System.out.println("program end");
		}

	}
}
