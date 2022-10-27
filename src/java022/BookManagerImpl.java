package java022;

import java.util.ArrayList;

public class BookManagerImpl implements BookManager {

	private ArrayList<Book> aList;

	private static BookManagerImpl mg = new BookManagerImpl();

	public BookManagerImpl() {
		aList = new ArrayList<>();
	}

	public static BookManagerImpl getInstance() {
		return mg;
	}

	@Override
	public void addBook(Book book) {
		boolean find = true;
		for (Book a : aList) {
			if (a.getIsbn().equals(book.getIsbn())) {
				System.out.printf(" 도서명: %s 은(는) 이미 소장하고 있는 책입니다.\n", book.getTitle());
				find = false;
				break;
			}
		}
		if (find == true) {
			aList.add(book);
			System.out.printf(" 도서명: %s 을(를) 성공적으로 추가하였습니다.\n", book.getTitle());
		}

	}

	@Override
	public ArrayList<Book> readAllBook() {
		return aList;
	}

	@Override
	public Book searchBookByIsbn(String isbn) {
		Book temp = new Book();
		for (Book a : aList) {
			if (a.getIsbn().equals(isbn))
				temp = a;
		}
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<>();
		for (Book a : aList) {
			if (a.getTitle().contains(title))
				temp.add(a);
		}
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> temp = new ArrayList<>();
		for (Book a : aList) {
			if (a.getPublisher().equals(publisher))
				temp.add(a);
		}
		return temp;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> temp = new ArrayList<>();
		for (Book a : aList) {
			if (a.getPrice() < price)
				temp.add(a);
		}
		return temp;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for (Book a : aList)
			total += a.getPrice();
		return total;
	}

	@Override
	public int getAvgPrice() {
		return getTotalPrice() / aList.size();
	}
}
