package java002_statements;

public class Java031_for {
	public static void main(String[] args) {
		int data = 1;
		
		for(int row = 1; row <= 3; row++) {
			for(int col = 1; col <= 4; col++) {
				System.out.printf("%4d", data++);
			}
			System.out.println("\n");
		}
	}
}
