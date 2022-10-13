package java008_static_access.part05;

public class Java088_access {
	public static void main(String[] args) {
		Java087_access js = new Java087_access();
//		js.var_default = 3; //파랑세모
//		js.var_protected = 4; //노랑다이아몬드
//		js.var_public = 5; //초록원
		
//		System.out.printf("var_private:%d\n", js.var_private;);
		System.out.printf("var_default:%d\n", js.var_default);
		System.out.printf("var_protected:%d\n", js.var_protected);
		System.out.printf("var_public:%d\n", js.var_public);
	}
}
