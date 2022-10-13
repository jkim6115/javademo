package java007_class.part05;

/*
 * [출력결과]
 * 기업은행 42523-52325 100000
 * 하나은행 52253-22623 153000
 * 신한은행 16239-95235 256000
 * 총납입액 : 509000
 */

public class Java078_class {
	public static void main(String[] args) {
		CreditCard[] cd = new CreditCard[3];
		cd[0] = new CreditCard("기업은행", "42523-52325", 100000);
		cd[1] = new CreditCard("하나은행", "52253-22623", 153000);
		cd[2] = new CreditCard("신한은행", "16239-95235", 256000);
		for(int i = 0; i < cd.length; i++) {
			System.out.println(cd[i].toString());
		}
		int sum = process(cd);
		printSum(sum);
	}
	
	public static int process(CreditCard[] cd) {
		int sum = 0;
		for(int i = 0; i < cd.length; i++) {
			sum += cd[i].pay;
		}
		return sum;
	}
	
	public static void printSum(int sum) {
		System.out.printf("총납입액 : %d", sum);
	}
}
