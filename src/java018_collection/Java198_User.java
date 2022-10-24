package java018_collection;

public class Java198_User {
	public static void main(String[] args) {
		Integer[] it = new Integer[] {1,5,3,2};
		Average<Integer> av = new Average<>(it);
		System.out.println(av.findAverage());
		
		Number[] nb = new Number[] {2, 5.3F, 4.5};
		Average<Number> ae = new Average<Number>();
		System.out.println(ae.findAverage());
		
		String[] sn = new String[]	 {"ava", "jap"};
//		Average<String> as = new Average<String>();
	}
}
