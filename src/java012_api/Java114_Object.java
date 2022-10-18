package java012_api;

/*
 *	Java API(Application Programming Interface)
 *	Object
 *	1. 클래스 중에서 최상의 클래스이다.
 *	2. Object를 제외한 모든 클래스들은 Object를 상속받고 있다.
 *	3. Java.lang 패키지에서 제공하는 클래스이다.
 */

public class Java114_Object {
	public static void main(String[] args) {
		Object ob = new Object();
		System.out.println(ob);
		System.out.println(ob.toString());
		
		int x = 5;
		int y = 5;
		//값비교(기본 데이터 타입)
		System.out.printf("x=%d, y=%d x==y:%b\n",x,y,x==y);
		
		Object ojt = new Object();
		//주소비교(참조 데이터 타입)
		System.out.printf("obj==ojt: %b\n", ob==ojt);
		
		//eauals() 주소비교, 객체 비교만 가능
		System.out.printf("obj.equal(ojt):%b\n",ob.equals(ojt));
		
		//class java.lang.Object
		System.out.println(ob.getClass());
		
		//java.lang.Object
		System.out.println(ob.getClass().getName());
		
		int num = ob.hashCode();
		System.out.println(num);
	}
}
