package java004_array;

public class Java041_array {
	public static void main(String[] args) {
		int[] data1 = new int[3];
		long[] data2 = new long[3];
		float[] data3 = new float[3];
		double[] data4 = new double[3];
		char[] data5 = new char[3]; // \u0000
		boolean[] data6 = new boolean[3]; //false
		String[] data7 = new String[3]; //null
		
		for(int i = 0; i < data1.length; i++) {
			System.out.printf("data[%d] = %b\n", i, data6[i]);
		}
		System.out.println("=============================");
		char a = ' ';
		char b = '\u0020'; //공백
		char c = '\u0000';
		char d = 0;
		
		System.out.println(a==b);
		System.out.println(c==d);
	}
}
