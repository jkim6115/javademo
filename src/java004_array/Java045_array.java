package java004_array;

public class Java045_array {
	public static void main(String[] args) {
		String[] name = {"홍길동", "이영희"};
		int[][] jumsu = {{90, 85, 40},{100, 35, 75}};
		
		int sum = 0;
		float average = 0;
		
		for(int i = 0; i < jumsu.length; i++) {
			System.out.printf("%s ", name[i]);
			
			for(int j = 0; j < jumsu[i].length; j++) {
				sum += jumsu[i][j];
				System.out.printf("%4d ", jumsu[i][j]);
			}
			
			average = (float)sum / jumsu[0].length;
			System.out.printf("%4d %.1f\n", sum, average);
			sum = 0;
		}
	}
}
