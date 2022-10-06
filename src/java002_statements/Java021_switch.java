package java002_statements;

/*
 * switch() {
 * 	case 1: 실행문
 * 	default: 실행문
 * }
 * 
 * 식의 결과 타입 : byte, short, char, int, enum(jdk7), String(jdk7)
 * switch~case에서 break을 만나면 현재 수행중인 제어문을 완전히 빠져나옴.
 */

public class Java021_switch {

	public static void main(String[] args) {
		int jumsu = 100;
		switch(jumsu/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}	
	}

}
