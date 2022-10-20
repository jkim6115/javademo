package java015_exception;

public class Java160_exception {
	public static void main(String[] args) {
		int data = 8;
		try {
		if(data<10) 
			throw new UserException("10이상만 입력하세요.");
		System.out.println(data);
		} catch (UserException e) {
			System.out.println(e.toString());
		}
	}
}
