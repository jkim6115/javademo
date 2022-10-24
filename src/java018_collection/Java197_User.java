package java018_collection;

public class Java197_User {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		intBox.setData(10);
		System.out.println(intBox.getData());
		
		Box<String> strBox = new Box<>("java");
		System.out.println(strBox.getData());
		
		Box<Double> dleBox = new Box<>(4.5);
		System.out.println(dleBox.getData());
	}// end main
}// end class
