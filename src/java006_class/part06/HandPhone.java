package java006_class.part06;

/*
 * 생성자(constructor)
 * 1. 객체의 초기값 할당
 * 2. 생성자명은 클래스명과 같다.
 * 3. 생성자는 클래스에서 1개 이상 존재한다.
 * 4. 클래스에 정의된 생성자가 없으면 jvm에서 기본 생성자를 제공한다.
 * 	[기본생성자]
 * 	-클래스의 접근제어자와 같고 파라미터가 없는 구조이다.
 * 		public HandPhone() {}
 * 	-클래스에 정의된 생성자가 존재하면 기본 생성자는 제공하지 않는다.
 */

public class HandPhone {
	
	//맴버변수
	String name;
	String number;
	
	//기본생성자
//	public HandPhone() {}
	
	HandPhone() {}
	
//	HandPhone(String number) {
//		this.number = number;
//	}
//	
	HandPhone(String name) {
		this.name = name;
		System.out.println(this);
	}
	
	HandPhone(String name, String number) {
		this.name = name;
		this.number = number;
		System.out.println(this);
	}
	
	void display() {
		System.out.printf("%s %s\n", name, number);
	}
}
