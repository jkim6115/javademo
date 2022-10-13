package java008_static_access.part07;

public class MemberDAO {
	private static MemberDAO dao = new MemberDAO(); //static끼리만 참조가능
	private MemberDAO() {
		
	}
	
	//객체를 한번만 생성해 메모리공간 절약
	//단점 : 프로그램이 종료될 때까지 메모리에 남아있음.
	public static MemberDAO getInstance() { 
		return dao;
	}
	
	public void display() {
		System.out.println("display");
	}
}
