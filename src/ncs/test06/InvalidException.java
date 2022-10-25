package ncs.test06;

public class InvalidException extends Exception{
	String message = "입력 값에 오류가 있습니다.";
	public InvalidException() {
		// TODO Auto-generated constructor stub
	}
	public InvalidException(String message) {
		super(message);
	}
}
