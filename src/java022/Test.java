package java022;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Book> aList = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1:추가 2:수정 3:삭제");
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println("추가를 선택");
		}
		System.out.print("책제목 입력: ");
		String title = sc.next();
		System.out.print("책 가격: ");
		int price = sc.nextInt();
		
		Book book = new Book(title, price);
		aList.add(book);
		
		System.out.println(aList.get(0));
		
		sc.close();
	}
}
