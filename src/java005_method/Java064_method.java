package java005_method;

public class Java064_method {
	public static void main(String[] args) {
		char[] arr = new char[] {'j','a','v','a',' ','t','e','s','t',};
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
	}
	
	public static char[] reverse(char[] data) {
		char[] reverseArr = new char[data.length];
		int j = 0;
		for(int i = data.length-1; i >= 0; i--) {
			reverseArr[j] = data[i];
			j++;
		}
		return reverseArr;
	}
}
