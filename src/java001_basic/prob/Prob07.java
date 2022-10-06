package java001_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램을 작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob07 {

	public static void main(String[] args) {
		int money = 7777;
		int mok = money/500;
		
		//여기에 작성하시오.
		System.out.printf("500원 : %d개\n",mok);
		System.out.printf("100원 : %d개\n",money%500/100);
		System.out.printf("50원 : %d개\n",money%500%100/50);
		System.out.printf("10원 : %d개\n",money%500%100%50/10);
		System.out.printf("1원 : %d개\n",money%500%100%50%10);
		
	}//end main()

}//end class


