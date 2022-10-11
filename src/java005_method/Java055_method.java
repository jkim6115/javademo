package java005_method;

public class Java055_method {
	public static void main(String[] args) {
		int a = 4, b = 2, c = 5;
		int[] num = new int[] {2,3};
		int[] data = new int[] {2,3,4,5};
		
		System.out.println(process(a,b,c));
		System.out.println(plus(num));
		System.out.println(plus(data));
	}
	
	public static int process(int x, int y, int z) {
		return x + y + z;
	}
	
	public static void process2(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	public static int plus(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
