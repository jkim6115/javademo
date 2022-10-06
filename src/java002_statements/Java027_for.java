package java002_statements;

public class Java027_for {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; ;i++) {
			sum += i;
			System.out.println(i);
			if(sum >= 15) {
				break;
			}	
		}
	}
}
