package java008_static_access.part06;

import java008_static_access.part05.Java087_access;

/*
 * 클래스 관계
 * 1. has a : 포함관계
 * 2. is a : 상속관계
 */

public class Java089_access extends Java087_access {
	public static void main(String[] args) {
//		Java087_access js = new Java087_access();
		Java089_access js = new Java089_access();
//		System.out.printf("var_private:%d\n", js.var_private;);
//		System.out.printf("var_default:%d\n", js.var_default); //같은 패키지 에서만 접근 가능
		System.out.printf("var_protected:%d\n", js.var_protected); //다른 패키지여도 자손클래스라면 접근 가능
		System.out.printf("var_public:%d\n", js.var_public);
	}
}
