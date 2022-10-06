package java002_statements;

public class Java026_for {
	public static void main(String[] args) {
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
