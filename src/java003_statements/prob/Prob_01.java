package java003_statements.prob;

/*
for문을 이용해서 12의 약수를 구하시오
약수 : 어떤 수를 나누어서 0으로 떨어진 수
1
2 
3 
4 
6 
12
*/

public class Prob_01 {

	public static void main(String[] args) {
		int measure = 12;
		for(int i = measure; i >= 1; i--) {
			if(measure % i == 0) {
				System.out.printf("%d\n", measure / i);
			}
		}
		
		

	}//end main()

}//end class













