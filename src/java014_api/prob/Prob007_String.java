package java014_api.prob;

/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob007_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {
		char[] arr = data.toCharArray();
		char[] num = new char[3];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				num[0] += 1;
			} else if(arr[i] >= 'A' && arr[i] <= 'Z') {
				num[1] += 1;
			} else {
				num[2] += 1;
			}
		}
		return num;
	}// end process()

	public static void display(char[] arr) {
		System.out.printf("영어 소문자 갯수: %d\n", (int)arr[0]);
		System.out.printf("영어 대문자 갯수: %d\n", (int)arr[1]);
		System.out.printf("숫자 갯수: %d\n", (int)arr[2]);
		
		
		
	}// end display()

}// end class
