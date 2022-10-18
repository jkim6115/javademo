package java012_api;

/*
 *	정규화 표현(Regular Expression)
 *	1. 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을
 *		찾아내기 위해 사용되는 것으로 미리 정의된 기호와 문자를 이용하여
 *		작성한 문자열을 말한다.
 */

public class Java124_RegEx {
	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";
		
//		for(int i = 0; i < sn.length(); i++) {
//			char data = sn.charAt(i);
//			if(data == 'a' || data == 'r') {
//				sg += "_";
//			} else {
//				sg += data;
//			}
//		}
		
		//대괄호는 or을 의미한다.
		//sn 변수에 저장된 문자열에서 a이거나 r이면 "_"로 변경한다.
		System.out.println(sn.replaceAll("[ar]", "_"));
		
		// '.'은 임의의 문자, '*'여러개
		// sn변수에 저장된 문자열에서 a이거나, r이 표함되어 있다면 true 아니면 false
		System.out.println(sn.matches(".*[ar].*"));
		
		//	sn변수 저장된 문자열에서 a이거나 r로 시작해면 true, 아니면 false
		System.out.println(sn.matches("[ar].*"));
		//	sn변수 저장된 문자열에서 a이거나 r로 끝나면 true, 아니면 false
		System.out.println(sn.matches(".*[ar]"));
		
		//{2,3} 2개부터 3개까지의 공백을 "@"으로 변경한다.
		String st = "java    korea";
		String sa = st.replaceAll("\\s{2,3}", "@");
		System.out.println(sa);
		System.out.println(sa.length());
	}
}
