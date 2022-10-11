package java005_method.prob;

public class Prob006_method {

	public static void main(String[] args) {
		System.out.println("<< 15 까지의 소수 >>");
		primeNumber(15);
		System.out.println("<< 32 까지의 소수 >>");
		primeNumber(32);
	}//end main( )

	private static void primeNumber(int num) {
		// 구현하세요.
		int cnt = 0;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				if(cnt > 2) {
					break;
				} 
				if(i % j == 0) {
					cnt += 1;
				}
			}
			if(cnt == 2) {
				System.out.printf("%4d",i);
			}
			cnt = 0;
		}
		System.out.println();
	}// end primeNumber( )
}//end class