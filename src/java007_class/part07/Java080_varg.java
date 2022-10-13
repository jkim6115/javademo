package java007_class.part07;

public class Java080_varg {
	public static void main(String[] args) {
		CountVarg cv = new CountVarg();
		cv.addValue(4,8);
		cv.addValue(4,8,3,6,7);
		cv.addValue(4,8,3);
		cv.addValue(4.2,8.2);
	}
}
