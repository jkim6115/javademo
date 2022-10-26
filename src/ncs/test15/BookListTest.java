package ncs.test15;

import java.util.ArrayList;
import java.util.List;

public class BookListTest {

	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book>();
		
		test5.storeList(list); 
		test5.printList(list);
	}
	
	public List<Book> storeList(List<Book> list) {
		
		Book b1 = new Book();
		b1.setTitle("자바의 정석");
		b1.setAuthor("남궁성");
		b1.setPrice(30000);
		b1.setPublisher("도우출판");
		b1.setDiscountRate(0.15);
		list.add(b1);
		
		Book b2 = new Book();
		b2.setTitle("열혈강의 자바");
		b2.setAuthor("구정은");
		b2.setPrice(29000);
		b2.setPublisher("프리렉");
		b2.setDiscountRate(0.2);
		list.add(b2);
		
		Book b3 = new Book();
		b3.setTitle("객체지향 JAVA8");
		b3.setAuthor("금영욱");
		b3.setPrice(30000);
		b3.setPublisher("북스홈");
		b3.setDiscountRate(0.1);
		list.add(b3);
		
		return list;
		
	}
	
	public void saveFile(List<Book> list) {
		
	}
	
	public void loadFile(List<Book> list) {
		
	}
	
	public void printList(List<Book> list) {
		for(Book book : list) {
			System.out.printf("%s, %s, %s, %d원, %.0f%% 할인\n", book.getTitle(), book.getAuthor(), book.getPublisher(), book.getPrice(), book.getDiscountRate()*100);
			System.out.printf("할인된가격 : %.0f 원\n", book.getPrice()*(1 - book.getDiscountRate()));
			
		}
	}
}
