package ncs.test05;

public class BookArrayTest {
	public static void main(String[] args) {
		Book bArray[] = new Book[3];
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);
		
		for(Book book : bArray) {
			System.out.printf("%s, %s, %s, %d원, %s%% 할인\n", book.getTitle(), book.getAuthor(), book.getPublisher(), book.getPrice(), (int)(book.getDiscountRate() * 100));
			System.out.printf("할인된 가격 : %d원\n", book.getPrice() - (int)(book.getPrice() * book.getDiscountRate()));
		}
	}
}
