package java006_class.part06;

public class Java070_constructor {
	//1. hp : 스택영역에 4바이트 메모리 생성
	//2. new : 힙영역에 객체 생성
	//3. HP() : 힙영역에 생성된 맴버변수에 초기값 할당
	//4.  = : 힙영역에 메모리주소 스택영역 
	
	public static void main(String[] args) {
		HandPhone hp = new HandPhone();
		hp.display();
		
		HandPhone hn = new HandPhone("홍길동");
		hn.display();
		
		HandPhone he = new HandPhone("홍길동", "01001001001");
		he.display();
	}
}
