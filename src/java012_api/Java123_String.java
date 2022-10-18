package java012_api;

public class Java123_String {
	public static void main(String[] args) {
		String p1 = "박상원,561203-1597650";
		String p2 = "김연아,030628-4056892";
		String p3 = "정해인,900824-8052582";
		display(p1);
		display(p2);
		display(p3);
	}
	
	public static void display(String str) {
		String[] data = str.split(",");
		String name = data[0];
		char chk = data[1].charAt(7);
		
		if(chk == '1' || chk == '3') 
			System.out.printf("%s님은 남성입니다.\n", name);
		else if(chk == '2' || chk == '4') 
			System.out.printf("%s님은 여성입니다.\n", name);
		else 
			System.out.println("잘못 입력하셨습니다.");
	}
}
