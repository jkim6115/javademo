package java007_class.part08;

public class java081_for {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("==========================================");
		
		/*
		 * 개선된 루프 = 확장된 루프 = 개선된 for문
		 * for(데이터타입 변수 : 배열 or 컬렉션){
		 * 	실행문;
		 * }
		 */
		
		for(int element : num) {
			System.out.println(element);
		}
	}
}
