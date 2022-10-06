package java002_statements;

/*
 * if(조건식) {
 *  if(조건식) {
 *  } else {
 *  	if(){
 *  	}
 *    }
 *  }
 */

public class Java018_if {

	public static void main(String[] args) {
		boolean menber = true; // 회원true, 비회원false
		String grade = "일반"; // VIP, 일반

		if (menber) {
			if (grade == "VIP") {
				// 회원
				System.out.printf("고객님은 %s이며 %d%%적립\n", grade, 30);

			} else {
				// 비회원
				System.out.printf("고객님은 %s이며 %d%%적립\n", grade, 10);
			}

		} else {
			System.out.printf("고객님은 %s이며 %d%%적립", grade, 0);
		}
	}

}
