package java017_collection.prob;

import java.util.ArrayList;
import java.util.Iterator;


public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		Iterator<BookDTO> bk = bookList.iterator();
		int sum = 0;
		while(bk.hasNext()) {
			BookDTO bDTO = bk.next();
			if(bDTO.getKind() == kind) {
				sum += bDTO.getRentalPrice();
			}
		}
		return sum;
	}//end getRentalPrice()
}//end class








