package java012_api.prob;

/* 
 * arr매개변수에서 '-'은 공백으로 , '/'은 ':'으로 변경한후
	리턴하는 프로그램을 구현하시오
 * [출력결과]
 * basic:java  web:jsp  framework:spring
 */
public class Prob004_String {

	public static void main(String[] args) {

		String data = "basic/java_web/jsp_framework/spring";
		System.out.println(process(data));
	}// end main()

	static String process(String str) {
		// arr매개변수에서 '_'은 공백으로 , '/'은 ':'으로 변경한후
		// 리턴하는 프로그램을 구현하시오.
		str = str.replaceAll("_", " ");
		str = str.replaceAll("/", ":");
		
		return str;
	}// end process()

}// end class



















