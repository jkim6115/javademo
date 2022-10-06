package java002_statements;

public class Java029_for {
	public static void main(String[] args) {
		int odd = 0;
		int even = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.printf("odd = %d, even = %d", odd, even);
	}
}
