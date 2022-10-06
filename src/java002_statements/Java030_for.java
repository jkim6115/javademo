package java002_statements;

public class Java030_for {
	public static void main(String[] args) {
//		for(int i = 1; i <= 10; i++) {
//			if(i % 3 != 0) {
//				System.out.println(i);
//			}
//		}
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
