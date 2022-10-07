package java004_array;

//num 배열에 저장된 요소의 합계를 구하는 프로그램 구현
public class Java039_array {
	public static void main(String[] args) {
		int[] num = new int[] { 22, 3, 8, 12 };
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.printf("sum = %d\n", sum);
	}
}
