package java013_api;

import java.util.Scanner;

public class Java140_Scanner {
	public static void main(String[] args) {
		//콘솔창에서 데이터를 읽어옴.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		
		//입력이 끝나면 next() 메소드를 읽는다.
		String name = sc.next(); //한 단어
//		String name = sc.nextLine(); //한 줄
		System.out.println(name);
		sc.close();
	}
}
