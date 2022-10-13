package java008_static_access.part07;

/*
 *  싱글톤 패턴(singletone pattern)
 *  1. 같은 형태의 객체를 생성할 때 사용한다.
 *  2. 하나의 객체만을 생성해서 참조하는 방법이다.
 *  3. 방법은 MemberDAO.java 참조
 *  4. 장점도 위 파일 참조
 */

public class Java090_singletone {
	public static void main(String[] args) {
		MemberDAO mb = MemberDAO.getInstance(); //생성자 호출이 가능해야 객체 생성가능
		mb.display();
		
		MemberDAO mc = MemberDAO.getInstance();
		mc.display();
		
		System.out.println(mb==mc);
	}
}
