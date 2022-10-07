package java004_array;

/*
 * 변수 : 하나의 값을 저장하기 위한 메모리 공간
 * 배열 : 서로 관련이 있는 데이터 타입이 같은 데이터의 집합
 */

public class Java037_array {
	public static void main(String[] args) {
		int ko = 90;
		int en = 80;
		int jp = 40;
		
		int[] arr; //배열선언 int arr[]
		//배열생성 : 메모리 할당
		//new 키워드를 이용해서 배열을 생성
		//각 요소(element)마다 인덱스가 0부터 생성된다.
		arr = new int[3]; //배열생성
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 40;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//배열의 크기 : length
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
