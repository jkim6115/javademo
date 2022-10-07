package java003_statements.prob;
/*
 * 
 * 2001부터 2012년사이에서 윤년을 구하시오 
 * 출력결과
 2004
 2008
 2012
 */

public class Prob_02 {

	public static void main(String[] args) {
		for(int i = 2001; i <= 2012; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.println(i);
			}
		}
      
       
	}//end main()

}//end class













