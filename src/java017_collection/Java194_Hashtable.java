package java017_collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/*
 *	HashTable
 *	1. Map인터페이스 구현해 놓은 클래스
 *	2. Map인터페이스를 구현해 놓은 클래스들은 key, value쌍으로 저장한다.
 *	3. value을 구현해주는 것은 key이므로 key은 중복을 허용하지 않는다.
 */

public class Java194_Hashtable {
	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "spring");

		System.out.println(table.get(10));

		System.out.println("===Enumeration===");

		Enumeration<String> enu = table.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

		Enumeration<Integer> enuKey = table.keys();
		while (enuKey.hasMoreElements()) {
			Integer key = enuKey.nextElement();
			System.out.printf("%d:%s\n", key, table.get(key));
		}
		
		System.out.println("========================");
		Set<Integer> st = table.keySet();
//		for(Integer key : table.keySet()) {
		for(Integer key : st) {
			System.out.printf("%d:%s\n", key, table.get(key));
		}
	}
}
