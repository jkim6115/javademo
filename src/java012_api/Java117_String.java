package java012_api;

public class Java117_String {
	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println("문자열길이:"+str.length());
		System.out.println("대문자:"+str.toUpperCase());
		System.out.println("소문자:"+str.toLowerCase());
		System.out.println("문자:"+str.charAt(0));
		System.out.println("인덱스:"+str.indexOf('a')); //4
		System.out.println("인덱스:"+str.indexOf(97)); //4
		System.out.println("인덱스:"+str.lastIndexOf('a')); //13
		//5 인덱스부터 마지막까지 문자열 리턴
		System.out.println("범위:"+str.substring(5)); //,jsp,java
		//2 인덱스부터 8미만까지 문자열 리턴
		System.out.println("범위:"+str.substring(2,8)); //REa,js
		
		//메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(",");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}
		
		int x = 10;
		int y = 20;
		System.out.printf("%d+%d=%d\n", x, y, x+y);
		
		//String <- int
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("%s+%s=%s\n", s1, s2, s1+s2);
		
		char[] data = {'1', '2', '3'};
		String s3 = String.valueOf(data);
		System.out.println(s3);
	}
}
