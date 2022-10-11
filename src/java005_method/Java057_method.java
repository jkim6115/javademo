package java005_method;

/*
 * 자바에서 제동하는 데이터 타입
 * 1. primitive : byte, char 등
 * 2. reference : array, class 등
 * 
 * [argument 전달방식]
 * 1. call by value : 값에 의한 복사
 * 		argument을 전달할 때 primitive data type을 넘겨주는 형식
 * 		장점 : 복사하여 처리하기 때문에 원래값이 보존되어 안전.
 * 		단점 : 복사를 하기 때문에 메모리 공간 차지 
 * 2. call by reference : 주소에 의한 복사
 * 		argument을 전달할 때 reference data type을 넘겨주는 형식
 * 		장점 : 참조를 하기 때문에 메모리를 절약
 * 		단점 : 참조에 의해 원래 값이 영항을 받는다.
 */

public class Java057_method {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int[] arr = new int[] {10,20};
		
		System.out.printf("%d %d\n", a, b);
		callByValue(a, b);
		System.out.printf("%d %d\n", a, b);
		callByReference(arr);
	}
	
	public static void callByValue(int c, int d) {
		int temp = c;
		c = d;
		d = temp;
		System.out.printf("%d %d\n", c, d);
	}
	
	public static void callByReference(int[] arr) {
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;
		System.out.printf("%d %d\n", arr[0], arr[1]);
	}
}
