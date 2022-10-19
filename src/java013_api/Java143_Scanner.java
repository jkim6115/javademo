package java013_api;

import java.util.Scanner;

public class Java143_Scanner {
	public static void main(String[] args) {
		while (true) {
			System.out.print("단 입력: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %d\n", num, i, num * i);
			}

			System.out.print("계속하시겠습니까?(종료:n, 계속:아무키): ");
			String chk = sc.next();
			if (chk.equals("n")) {
				break;
			}
		}
	}
}
