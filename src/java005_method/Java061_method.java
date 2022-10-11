package java005_method;

/*
 * [출력결과]
 * 20은/는 양수입니다.
 * 0은 0입니다.
 * -20은/는 음수입니다.
 */

public class Java061_method {
	public static void main(String[] args) {
		process(20);
		process(0);
		process(-20);
	}
	
	public static void process(int num) {
		if(num > 0) {
			System.out.printf("%d(은)는 양수입니다.\n", num);
		} else if(num == 0) {
			System.out.printf("%d은 0입니다.\n", num);
		} else {
			System.out.printf("%d(은)는 음수입니다.\n", num);
		}
	}
}
