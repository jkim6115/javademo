package java017_collection;

import java.util.ArrayList;

public class Java186_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		String[] arr = disPlay(aList);
		for(String data : arr) {
			System.out.println(data);
		}
	}
	
	public static String[] disPlay(ArrayList<String> aList) {
//		String[] stn = new String[aList.size()];
//		for(int i = 0; i < stn.length; i++) {
//			stn[i] = aList.get(i);
//		}
//		return stn;
		
//		String[] stn = new String[aList.size()];
//		
//		return aList.toArray(stn);
		
		return aList.toArray(new String[aList.size()]);
	}
}
