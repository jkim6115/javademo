package java017_collection;

import java.util.Iterator;
import java.util.TreeSet;

//treeset : 오름차순 정렬, 중복안됨.

public class Java192_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		Integer it1 = new Integer(10);
		Integer it2 = new Integer(40);
		Integer it3 = new Integer(20);
		Integer it4 = new Integer(30);
		Integer it5 = new Integer(20);

		tree.add(it1);
		tree.add(it2);
		tree.add(it3);
		tree.add(it4);
		tree.add(it5);

		System.out.println("===오름차순===");
//		System.out.println(tree.size());
		int cnt = tree.size();
//		for (int i = 0; i < cnt; i++) {
//			Integer value = tree.pollFirst();
//			System.out.println(value==it3);
//			System.out.printf("tree[%d]=%d\n", i, value);
//		}
		
		for(Integer it : tree) {
			System.out.println(it);
		}
		
		Iterator<Integer> ita = tree.iterator();
		while(ita.hasNext()) {
			System.out.println(ita.next());
		}
		
		System.out.println("===내림차순===");
		Iterator<Integer> ite = tree.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
