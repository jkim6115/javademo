package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);
	}

	public static void prnDisplay(ArrayList<String> alist) {
		// alist 매개변수의 요소에서 J or j 가 포함되어 있는 요소만 출력
		for(String sn : alist) {
			if(sn.toLowerCase().contains("j")) {
				System.out.println(sn);
			}
		}
	}
	
	public static void process(ArrayList<String> alist) {
		System.out.println(alist.contains("jsp"));
	}
}
