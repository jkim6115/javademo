package java017_collection;

import java.util.ArrayList;

/*
 *	Vector와 ArrayList
 *	1. Vector은 동기화 처리가 되어 있고 ArrayList은 비동기화 처리한다.
 *	2. Vector와 ArrayList은 메모리에 요소를 처리할 때 배열의 구조를 따른다.
 *	3. Vector와 ArrayList의 클래스는 처리방법이 비슷하다.
 *	4. Vector와 ArrayList으로 수시로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아니다.
 */

public class Java184_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(10); //auto boxing -> up-casting
		alist.add(20);
		alist.add(30);
		
		for(Integer data : alist) {
			System.out.println(data);
		}
		
		System.out.println("===========================");
		
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		System.out.println("===========================");
		System.out.println(alist.remove(0));
		
		System.out.println("===========================");
		
		System.out.println(alist.remove(new Integer(20)));
		for(Integer data : alist) {
			System.out.println(data);
		}
	}
}
