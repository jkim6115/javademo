package java005_method;

/*
 * method 정의
 * 1. 값을 계산하기 위해서 사용되는 기능
 * 2. 객체의 동작을 처리하기 위한 기능
 * 
 * method정의 : 선언부 + 구현부
 * 반환자료형 메소드형(데이터타입) => 메소드 선언부
 * {
 * 	메소드가 호출되었을 때 실행문	=> 메소드 구현부
 * 	return 값;
 * }
 * 
 * 매개변수 = parameter
 * 인수 = argument
 * 
 * 1. 리턴값이 없고 매개변수도 없는 형태
 * 	void add(){
 * 		int x = 10;
 * 		int y = 20;
 * 		System.out.ptintln(x+y);
 * 		if(x<0) {
 * 			return ;
 * 		}
 * 	}
 * 
 * 2. 리턴값은 있으나 매개변수는 없는 형태
 *  double avg() {
 *  	int x = 10;
 *  	int y = 20;
 *  	return (x+y) / 2;
 *  }
 *  
 * 3. 리턴값이 없고 매개변수가 있는 형태
 *  void plus(int x, int y) {
 *  	System.out.println(x + y);
 *  }
 *  
 *  4. 리턴값도 있고 매개변수도 있는 형태
 *  double avg(int x, int y) {
 *  	return (x+y)/2.0;
 *  }
 */

public class Java052_method {
	public static void main(String[] args) {
		/*
		 * 프로스램 실행시
		 * JVM main 스레드가 main()매소드 호출
		 * 
		 * JVM 운영체제에 특화된 코드로 변환.
		 */
		
		System.out.println("start");
		makeTest();
		System.out.println("end");
	}
	
	public static void makeTest() {
		System.out.println("makeTest");
	}
}
