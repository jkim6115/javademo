package java022_debug;

/*
  bug : 어떤 의도하지 않는 문제가 발생한 오류
  debug : bug를 찾아 수정하는 작업
  debugging : bug를 원하는 대로 실행이 되도록 작업하는 과정
  debugger : 디버깅툴
 */

public class DebugTest01 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			sum += count(i);
		}
		System.out.println("sum = " + sum);
	}// end main

	public static int count(int index) {
		int[] num = new int[] { 1, 5, 2, 3, 4 };
		return num[index];
	}// end count
}// class
