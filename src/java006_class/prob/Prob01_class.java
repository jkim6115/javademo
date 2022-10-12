package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////
		String name = "도넛";
		int r = 10;
		double circleArea = Math.pow(r, 2) * Math.PI;
		System.out.printf("자바%s의 면적은 %.2f", name, circleArea);
		
	}//end main()

}//end class
