package java011_casting.part01;

/*
 *	객체형변환 - 참조데이터
 *	1. 두 객체가 서로 상속 관계일 때 형변환이 가능(is a)
 *	2. 업캐스팅 후 다운캐스팅이 가능
 *		업캐스팅 : 부모객체로 자식객체를 참조할 수 있도록 형변환
 *		다운캐스팅 : 업캐스팅을 원상복귀해주는 형변환
 */

public class Java109_casting {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		//parent p = new Child()
		p = c; //업캐스팅(up-casting)
		p.process();
		
		c = (Child) p;
		
		//다운캐스팅
		Child d = (Child) p;
	
		//객체생성 및 업캐스팅
		Parent pt = new Child();
		pt.process();
		
		//다운캐스팅
		Child cn = (Child)pt;
		cn.call();
		}
}
