package java005_method;

/*
 * [출력결과]
 * 홍길동님은 회원입니다.
 * 3000포인트가 적립되었습니다.
 */

public class Java053_method {
	public static void main(String[] args) {
		memderCheck("홍길동", true);
		memderPoint(3000);
	}
	
	public static void memderCheck(String name, boolean chk) {
		if(chk) {
			System.out.printf("%s님은 회원입니다.\n",name);
		} else {
			System.out.printf("%s님은 비회원입니다.\n",name);
		}
	}
	
	public static void memderPoint(int point) {
		System.out.printf("%d포인트가 적립되었습니다.",point);
	}
}
