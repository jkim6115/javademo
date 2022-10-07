package java003_statements.prob;
/*
 * 1. 이중 for문을 이용해서 1부터 20사이의 정수에서 2,3,4,5의 배수를 수행하는 
 *    프로그램을 구현하시오.
 * 2. 출력결과
 *    2의 배수 :    2   4   6   8  10  12  14  16  18  20
 *    3의 배수 :    3   6   9  12  15  18
 *    4의 배수 :    4   8  12  16  20
 *    5의 배수 :    5  10  15  20
 *     
 */




public class Prob_05 {

	public static void main(String[] args) {
		int temp = 0;
		for(int i = 2; i <= 5; i++) {
			System.out.printf("%d의 배수 : ", i);
			for(int j = 1; j <= 10; j++) {
				temp = i * j;
				if(temp > 20) {
					break;
				} else {
					System.out.printf("%4d", temp);
				}
			}
			System.out.println();
		}
	}//end main()

}//end class
