package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) throws InvalidException {
		try (Scanner sc = new Scanner(System.in)) {
			double sum = 0;
			int num = 0;
			Calculator cal = new Calculator();
			
			System.out.print("정수입력 : ");
			num = sc.nextInt();
			if (!(num >= 2 && num <= 5)) {
				throw new InvalidException("입력 값에 오류가 있습니다");
			}
			
			sum = cal.getSum(num);

			System.out.println(sum);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}// end mainc
}// end class
