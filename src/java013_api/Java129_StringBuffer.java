package java013_api;

/*
 * java.lang.String: immutable 불변
 * java.lang.StringBuffer: mutable 가변, 동기화
 * java.lang.StringBuilder: mutable 가변, 비동기화
 * 
 * StringBuffer 특징
 * 1. 문자열 값을 수정할 수 있는 mitable(가변)이다.
 * 2. 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.
 */

public class Java129_StringBuffer {
	public static void main(String[] args) {
		String sg = new String("java test java");
		String ss = sg.replace("java", "jsp");
		System.out.println("ss:"+ss);
		System.out.println("sg:"+sg);
		System.out.println(ss=sg);
		System.out.println(sg.toString());
		
		StringBuffer sb = new StringBuffer("String test");
		StringBuffer su = sb.replace(0, 6, "framework");
		System.out.println("sb:"+sb);
		System.out.println(sb==su);
		System.out.println(sb.toString());
	}
}
