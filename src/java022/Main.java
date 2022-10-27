package java022;

import java.util.ArrayList;
//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Book> bs = new ArrayList<>();
		bs.add(new Book("9788937485619", "잃어버린 시간을 찾아서", "마르셀 프루스트", "민음사", 15000, "19세기 유럽소설의 결정체"));
		bs.add(new Book("9788954620512", "데미안", "헤르만 헤세", "민음사", 8000, "청춘 소설의 위대한 바이블"));
		bs.add(new Book("9788932918143", "동급생", "프레드 울만", "열린책들", 11800, "제 13회 문학동네 어린이 문학상 수상작"));
		bs.add(new Book("9788937460586", "싯다르타", "헤르만 헤세", "민음사", 8000, "삶의 찌든 때를 훌훌 털고 싶은 이들에게"));

		@SuppressWarnings("unused")
		PrintBooks prnBooks = new PrintBooks(bs);
	}// end main
}// end class
