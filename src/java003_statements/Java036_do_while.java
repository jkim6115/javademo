package java003_statements;

/*
 * do{
 * 	실행문
 * }while();
 */

public class Java036_do_while {
	public static void main(String[] args) {
		char chk = 'y';
		do {
			System.out.println("주문하시겠습니까?(y/n)");
		} while(chk=='n');
	}
}
