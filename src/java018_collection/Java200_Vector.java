package java018_collection;

import java.util.Vector;

public class Java200_Vector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("java");
		v.add("jsp");
		v.add("spring");
		
		System.out.println(v.toString());
		
		Vector<String> t = new Vector<>();
		t.add("java");
		t.add("mysql");
		System.out.println(t.toString()); //string[] 배열이 아니라 String
		System.out.println(t.toString().length()); //13, 대괄호 포함
		
		v.removeAll(t); // v.toString - t.toString 차집합 
		System.out.println(v.toString());
	}
}
