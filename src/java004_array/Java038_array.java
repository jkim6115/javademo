package java004_array;

public class Java038_array {
	public static void main(String[] args) {
		//javascript : const arr = [];
		
		int[] data = {10,20,30};
		//초기값을 할당하면서 배열을 생성할 경우 배열의 크기는 생략한다.
		int[] jumsu = new int[] {90,80,60};
		
		for(int i=0; i<data.length; i++) {
			System.out.println(jumsu[i]);
		}
		
		for(int i=data.length-1; i>=0; i--) {
			System.out.println(jumsu[i]);
		}
	}
}
