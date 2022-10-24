package java017_collection;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 *	1. 배열 구조로 데이터 관리 : Vector, ArrayList
 *								ArrayList-추가-
 *	2. 노드로 데이터 관리 : LinkedList
 *							삽입, 삭제-비순자적으로 처리
 *	3. list을 구현해놀은 컬렉션
 *	Vector, ArrayList, LinkedList은 add()해준 순서대로 데이터 관리
 */

public class Java188_LinkedList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));

		// insert
		aList.add(1, new String("mysql"));

		// remove
		aList.remove(2);

		for (int i = 0; i < aList.size(); i++) {
			System.out.printf("aList[%d]=%s\n", i, aList.get(i));
		}

		// linkedlist
		System.out.println("===linkedlist===");
		LinkedList<String> aNode = new LinkedList<>();
		// append
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));

		// insert
		aNode.add(1, new String("mysql"));

		// remove
		// 무조건 첫번째 요소를 삭제
		aNode.remove();
		// 마지막 요소를 삭제
		aNode.removeLast();
		// 특정 인덱스의 요소 삭제
		aNode.remove(1);

		for (int i = 0; i < aNode.size(); i++) {
			System.out.printf("aNode[%d]=%s\n", i, aNode.get(i));
		}
	}
}
