package java005_method;

/*
 * [출력결과]
 * 10 => 짝수
 * 9 => 홀수
 */

public class Java059_method {
	public static void main(String[] args) {
		int data = 10;
//		String result = process(data) ? "짝수" : "홀수";
		
//		boolean chk = process(data);
//		if(chk) {
//			System.out.printf("%d는 %s입니다.", data, result);
//		} else {
//			System.out.printf("%d는 %s입니다.", data, result);
//		}
		System.out.printf("%d는 %s입니다.", data, process(data) ? "짝수" : "홀수");
	}
	
	public static boolean process(int data) {
		if(data % 2 == 0) {
			return true;
		} else {
			return false;
		}
		//return data % 2 == 0 ? true : false;
	}
}
