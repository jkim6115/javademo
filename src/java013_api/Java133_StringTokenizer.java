package java013_api;

import java.util.Iterator;
import java.util.StringTokenizer;

public class Java133_StringTokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("java,/jsp,spring",",/");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("=========================================");
		String[] data = new String("java,/jsp,spring").split("[,/]");
		System.out.println(data.length);
		for(int num =0; num < data.length; num++) {
			System.out.printf("data[%d]=%s\n",num,data[num]);
		}
	}
}
