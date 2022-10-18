package java012_api;

public class Java115_String {
	public static void main(String[] args) {
		char[] data = {'j', 'a', 'V', 'A'};
		StringTest st = new StringTest(data);
		System.out.println(st.length());
		System.out.println(st.isUpperCase(2));
		System.out.println(st.isUpperCase(0));
		System.out.println(st.isUpperCase(0));
		System.out.println(st.isUpperCase(2));
		System.out.println(st.charAt(0));
		System.out.println(st.toString());
		System.out.println(st);
	}
}

