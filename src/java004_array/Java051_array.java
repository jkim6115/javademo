package java004_array;

public class Java051_array {
	public static void main(String[] args) {
		char[][] color = new char[3][];
		color[0] = new char[] {'r', 'e', 'd'};
		color[1] = new char[] {'g', 'r', 'e', 'e', 'n'};
		color[2] = new char[] {'p', 'i', 'n', 'k'};
		
		for(int i = 0; i < color.length; i++) {
			for(int j = 0; j < color[i].length; j++) {
				System.out.printf("%c", color[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		for(int i = 0; i < color.length; i++) {
			System.out.println(color[i]);
		}
	}
}
