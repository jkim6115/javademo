package java012_api;

public class Java127_RegEx {
	public static void main(String[] args) {
		System.out.print("851306-2689540");
		display(process("851306-2689540"));
		
		System.out.print("750625-16843");
		display(process("750625-16843"));
	}
	
	public static boolean process(String sn) {
		
		return sn.matches("\\d{6}-\\d{7}");
	}
	
	public static void display(boolean res) {
		if(res) {
			System.out.println(" 승인이 되었습니다.");
		} else {
			System.out.println(" 다시 입력하세요.");
		}
	}
}
