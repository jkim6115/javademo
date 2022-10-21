package java017_collection;

import java.util.Vector;

public class Java182_Vector {
	public static void main(String[] args) {
		//Vector 생성자에 인자값이 없으면 용량의 기본값은 10이다.
		Vector<String> v = new Vector<String>();
		v.addElement(new String("java")); //append
		v.add(new String("jsp")); //append
		v.add(1, new String("spring")); //insert
		
		for(String num : v) {
			System.out.println(num);
		}
		
		//요소가 저장되어 있지 않은 메모리 제거
		v.trimToSize();
		
		System.out.println("용량크기: "+v.capacity());
		System.out.println("요소개수: "+v.size());
		
	}
}
