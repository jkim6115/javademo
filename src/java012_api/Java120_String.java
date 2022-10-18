package java012_api;

public class Java120_String {
	public static void main(String[] args) {
		System.out.println("<< 첫 번째 메시지 >>");
		handleMessage("PROD-00001:iPhone4:940000:4:애플");
		System.out.println("<< 두 번째 메시지 >>");
		handleMessage("PROD-00002:갤럭시S:960000:삼성");
	}
	
	private static void handleMessage(String sn) {
		String[] arr = sn.split(":");
		
		if(arr.length == 5) {
			System.out.printf("제품 아이디 : %s\n", arr[0]);
			System.out.printf("제품명 : %s\n", arr[1]);
			System.out.printf("가격 : %s\n", arr[2]);
			System.out.printf("수량 : %s\n", arr[3]);
			System.out.printf("제조사 : %s\n", arr[4]);
		} else {
			System.out.println("메시지 형식이 잘못되었습니다.");
			System.out.println("메시지는 제품아이디:제품명:가격:수량:제조사 형식이어야 합니다.");
		}
	}
}
