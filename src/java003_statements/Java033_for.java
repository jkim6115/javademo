package java003_statements;

/*
 *  반복문에서 특정위치로 이동을 하거나 빠져나올 때,
 *  반복문에서 label을 선언하고 호출하면 됨.
 */

public class Java033_for {
	public static void main(String[] args) {
		
//		move:
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 3; j++) {
				for(int k = 1; k <= 2; k++) {
//					break move;
//					continue;
//					break go;
					break;
				}
				System.out.printf("i=%d\n",i);
			}
			System.out.printf("KK");
		}
		System.out.printf("end");
	}
}
