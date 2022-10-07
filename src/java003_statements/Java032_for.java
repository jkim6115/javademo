package java003_statements;

public class Java032_for {
	
	public static void main(String[] args) {
		for(int row = 0; row <= 3; row++) {
			int data = 1;
			for(int col = 1; col <= 5; col++) {
				System.out.printf("%4d", data++);
			}
			System.out.println();
		}
	}
	
}
