package java017_collection;

import java.util.Vector;

/*
 * 배열 : length
 * 문자열 : length()
 * 컬렉션 : size()
 * 
 * 제너릭 : 다운캐스팅을 생략할 수 있도록 한다.
 */

public class Java180_Vector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		
		// 일반 반복문
		for (int i = 0; i < v.size(); i++) {
			String data = v.get(i);
			System.out.println(data);
		}
		
		//개선된 반복문
		//for(데이터타입 변수 : 배열 or 컬렉션) { }
		for(String data : v) {
			System.out.println(data);
		}
		
		Vector<Number> vt = new Vector<Number>();
		//Integer -> Number -> Object : up-casting
 		vt.add(new Integer(10));
		//Double -> Number -> Object : up-casting
 		vt.add(new Double(10.4));
 		//Float -> Number -> Object : up-casting
 		vt.add(new Float(4.8f));
 		
 		for(Number ne : vt) {
 			if(ne instanceof Integer) {
 				Integer it = (Integer)ne;
 				System.out.println(it);
 			} else if(ne instanceof Double) {
 				Double de = (Double)ne;
 				System.out.println(de);
 			} else if(ne instanceof Float) {
 				Float ft = (Float)ne;
 				System.out.println(ft);
 			}
 		}
	} //end main
} //end class
