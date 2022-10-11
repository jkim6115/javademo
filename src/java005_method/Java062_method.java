package java005_method;

/*
 * [출력결과]
 * 입시총점 : 135점
 * 입시결과 : 불합격
 */

public class Java062_method {
	public static void main(String[] args) {
		int topic = 75;
		int it = 60;
		int sum = total(topic, it);
		System.out.printf("입시총점 : %d점\n", sum);
		System.out.printf("입시결과 : %s\n ", rs(sum));
	}
	
	public static int total(int topic, int it) {
		int tot = topic + it;
		return tot;
	}
	
	public static String rs(int tot) {
		if(tot >= 800) {
			return "합격";
		} else {
			return "불합격";
		}
	}
}
