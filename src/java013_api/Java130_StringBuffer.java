package java013_api;

public class Java130_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		sb.insert(4, ",jsp");
		System.out.println(sb);

		// 4~8 삭제
		sb.delete(4, 8); // java test

		sb.append(" start");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb); // trats tset avaj

		String data = "mybaits orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);
		System.out.println(data);
		String re = sf.toString();
		System.out.println(re);

		// 문자열을 반대로 변경
		String data1 = "mybatis orm";
		System.out.println(sb);

		// char[] -> String -> StringBuffer
		char[] arr = { 'k', 'o', 'r', 'e', 'a' };
		String sp = String.valueOf(arr);
		StringBuffer se = new StringBuffer(sp);
		se.reverse();
		System.out.println(se);

		System.out.println(new StringBuffer(String.valueOf(arr)).reverse());

		// StringBuffer -> String -> char[]
		String st = se.toString();
		char[] val = st.toCharArray();
		System.out.println(val);

		System.out.println(se.toString().toCharArray());

	}
}
