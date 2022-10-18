package java012_api;

import java.util.regex.Pattern;

public class Java128_RegEx {
	public static void main(String[] args) {
		System.out.print("ymy232");
		display(process("y23m1"));
		
		System.out.print("korea");
		display(process("korea"));
	}
	
	public static boolean process(String sn) {

		return sn.matches(".*?[a-zA-z]{1}+[0-9]+[a-zA-Z].*{4,9}");
//		return sn.matches("[a-zA-z][a-zA-Z0-9]{4,9}") && Pattern.compile("\\d").matcher(sn).find();
	}
	
	public static void display(boolean res) {
		if(res) {
			System.out.println(" 로그인이 되었습니다.");
		} else {
			System.out.println(" 회원이 아닙니다.");
		}
	}
}
