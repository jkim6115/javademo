package java013_api;

import java.util.StringTokenizer;

public class Java132_StringTokenizer {
	public static void main(String[] args) {
		//StringTokenizer(문자열, 구분자)
		//문자열의 구분자가 공백일 때 2번째 인자값은 생략이 가능하다.
		//StringTokenizer st = new StringTokenizer("java,jsp", ",");
		
		StringTokenizer st = new StringTokenizer("java jsp");
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.countTokens());
		
//		int count = st.countTokens();
//		for(int i = 0; i < count; i++) {
//			System.out.println(st.nextToken());
//		}
		
		//메모리에 저장된 토큰이 있으면 true, 없으면 false
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
