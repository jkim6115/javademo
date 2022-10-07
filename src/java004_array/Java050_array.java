package java004_array;

public class Java050_array {
	public static void main(String[] args) {
//		int[][] num = new int[3][];
//		num[0] = new int[2]; // 0행에 2열 생성
//		num[1] = new int[3]; // 1행에 3열 생성
//		num[2] = new int[5]; // 2행에 5열 생성
		
		int[][] num = new int[][] {{1,2},{3,4,5},{6,7,8,9,10}};
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.printf("%4d", num[i][j]);
			}
			System.out.println();
		}
	}
}
