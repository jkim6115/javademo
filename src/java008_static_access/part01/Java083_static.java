package java008_static_access.part01;

/* 
 * static
 * 1. class loader일 때 method area에 정이이 된다/
 * 2. 같은 클래스로 생성된 객체까리 공유해서 사용한다.
 * 3. static 키워드가 선언된 메소드에서 this, super를 사용할 수 없다. 
 * 
 * 여러 인스턴스가 공유해 사용할 수 있다. static으로 선언하면 이는 힙영역이 아닌
 * 데이터 영역에 생성된다.
 */

public class Java083_static {
	public static void main(String[] args) {
		System.out.printf("StaticEx.y=%d\n", StaticEx.y);
//		System.out.printf("StaticEx.x=%d\n", StaticEx.x);
		
		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		
		StaticEx ss = new StaticEx();
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
		
		se.x=20;
		se.y=30;
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
	}
}
