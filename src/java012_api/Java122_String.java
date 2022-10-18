package java012_api;

public class Java122_String {
	public static void main(String[] args) {
		System.out.print("35276은 ");
		prnDisplay(numCheck("35276"));
		
		System.out.print("2_8a은 ");
		prnDisplay(numCheck("2_8a"));
	}
	
	public static boolean numCheck(String data) {
		boolean chk = false;
		for(int i = 0; i < data.length(); i++) {
			if(data.charAt(i) >= '0' && data.charAt(i) <= '9') {
				chk = true;
			}	else {	
				chk = false;
			}
		}
		return chk; 	
	}
	
	public static void prnDisplay(boolean chk) {
		if(chk) {
			System.out.println("숫자입니다.");
		} else {
			System.out.println("문자입니다.");
		}
	}
}
