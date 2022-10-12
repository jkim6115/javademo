package java006_class.part07;

/*
 * this : 객체 자신을 의미한다.
 * 1. this.맴버변수
 * 2. this.메소드()
 * 3. this() : 생성자
 * 
 * 참조변수(this)는 4바이트(32bit) or 8바이트(64bit) 주소값을 가진다.
 */

public class Product {
	String code;
	String pname;
	int cnt;
	
	public Product() {
		this("p002", "식품", 3000);
	}

	public Product(String code, String pname, int cnt) {
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}
	
//	public Product(String code, String pname, int cnt) {
//		this.code = code;
//		this.pname = pname;
//		this.cnt = cnt;
//	}
	
	void display() {
		System.out.printf("%s %s %d\n", code, pname, cnt);
	}
	
	void prn() {
		this.display();
	}
}
