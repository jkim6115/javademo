package java022;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintBooks {
	
	public PrintBooks(ArrayList<Book> bs) {

		BookManagerImpl BookMg = BookManagerImpl.getInstance();
		boolean chk = true;

		for (Book book : bs) {
			System.out.println(book);
			BookMg.addBook(book);
			System.out.println();
		}

		while (chk == true) {
			System.out.println("================================================================");
			System.out.println("1: 도서조회");
			System.out.println("2: 도서추가");
			System.out.println("3: 도서검색");
			System.out.println("4: 도서 가격합계 및 평균 조회");
			System.out.println("5: 종료");
			System.out.println("================================================================");
			System.out.print("번호를 선택하세요 > ");

			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("책을 조회합니다.");
				System.out.println();
				System.out.println(BookMg.readAllBook());
				break;

			case 2:
				System.out.print("ISBN을 입력하세요: ");
				String isbn = sc.next();
				System.out.print("책 제목을 입력하세요: ");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("작가를 입력하세요: ");
				String author = sc.nextLine();
				System.out.print("출판사를 입력하세요: ");
				String publisher = sc.nextLine();
				System.out.print("가격을 입력하세요: ");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.print("간단한 설명을 입력하세요: ");
				String desc = sc.nextLine();

				BookMg.addBook(new Book(isbn, title, author, publisher, price, desc));

				break;

			case 3:
				System.out.println("===============================");
				System.out.println("1. ISBN 검색");
				System.out.println("2. 책 제목 검색");
				System.out.println("3. 출판사 검색");
				System.out.println("4. 특정 가격 밑으로 책 검색");
				System.out.println("5. 이전으로");
				System.out.println("===============================");
				System.out.print("번호를 선택하세요 > ");
				sc.nextLine();
				int search = sc.nextInt();

				if (search == 1) {
					System.out.print("ISBN을 입력하세요: ");
					String ISBN = sc.next();
					sc.nextLine();
					System.out.println(BookMg.searchBookByIsbn(ISBN));
				} else if (search == 2) {
					System.out.print("책 제목을 입력하세요: ");
					sc.nextLine();
					String TITLE = sc.nextLine();
					System.out.println(BookMg.searchBookByTitle(TITLE));
				} else if (search == 3) {
					System.out.print("출판사를 입력하세요: ");
					String PUBLISHER = sc.next();
					System.out.println(BookMg.searchBookByPublisher(PUBLISHER));
				} else if (search == 4) {
					System.out.print("가격을 입력하세요: ");
					int PRICE = sc.nextInt();
					sc.nextLine();
					System.out.println(BookMg.searchBookByPrice(PRICE));
				} else if (search == 5)
					chk = true;
				else
					System.out.println("잘못 입력하셨습니다.");

				break;

			case 4:
				System.out.printf("책 가격 합계 : %d\n", BookMg.getTotalPrice());
				System.out.printf("책 가격 평균 : %d\n", BookMg.getAvgPrice());
				break;

			case 5:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				chk = false;
				break;

			default:
				System.out.println("번호를 잘못 입력하였습니다.");
				break;
			}
		}
	}// end prnBooks()
}
