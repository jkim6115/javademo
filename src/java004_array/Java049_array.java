package java004_array;

public class Java049_array {
	public static void main(String[] args) {
		char[][] arr = new char[][] {{'a', 'b', 'c', 'd'},{'a', 'b', 'c', 'd'},{'a', 'b', 'c', 'd'}, {'a', 'b', 'c', 'd'}};
		
		char star = '*';
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == j) {
					System.out.printf("%2c", star);
				}
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
			if(i == arr.length-1) {
				for(int k = 0; k < arr[i].length; k++) {
					System.out.printf("%2c", arr[i][k]);				
				}
				System.out.printf("%2c", star);
			}		
		}
	}
}
