package java008_static_access.part02;

/*
 * class 클래스명 {
 * 	맴버변수;
 * 	static();
 * 	생성자();
 * 	메소드();
 * }
 */

public class OrderStatic {
	static {
		System.out.println("static");
	}
	
	public OrderStatic() {
		System.out.println("constructor");
	}
	
	public void display() {
		System.out.println("display");
	}
}
