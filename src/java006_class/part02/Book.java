package java006_class.part02;

public class Book {
	String title;
	boolean state;
	
	String process() {
		if(state) {
			return "대출가능";
		} else {
			return "대출중";
		}
	}
	
	void display() {
		System.out.printf("%s, %s\n", title, process());
	}
	
	void borrow() {
		state = false;
	}
}
