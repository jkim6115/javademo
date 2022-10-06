package java002_statements;

public class Java025_for {

	public static void main(String[] args) {
		//누적된 값이 최초로 15이상일 때 까지만 반복문을 수행
		
		int sum = 0;
		int i;
		
		for(i=1; ;i++) {
			sum += i;
			if(sum >= 15) {
				break;
			}
		}
		System.out.println(sum);
	}

}
