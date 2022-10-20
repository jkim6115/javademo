package java015_exception;

//사용자가 정의한 Exception
public class UserException extends Exception {
	public UserException(String message) {
		super(message);
	}
}
