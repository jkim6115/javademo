package ncs.test14;

import java.io.BufferedReader;
import java.util.Scanner;

public class GoodsTest {

	public static void main(String[] args) {
		// BufferedReader 에 대해 선언한다.
		BufferedReader br = null;
		Goods goods = new Goods();
		//br 에 대한 키보드 입력스트림 객체 생성하고, 입력 처리하고 출력처리 한다.
		//try catch resource 문으로 작성한다.
		
		Scanner sc = new Scanner(System.in);
		Goods gd = new Goods();
		try {
			System.out.println("다음항목의 값을 입력하시오.");
			System.out.print("상품명 : ");
			gd.setName(sc.nextLine());
			System.out.print("가격 : ");
			gd.setPrice(sc.nextInt());
			System.out.print("수량 : ");
			gd.setQuantity(sc.nextInt());
			System.out.println();
			System.out.println("입력된 결과는 다음과 같습니다");
			System.out.printf("%s, %d 원, %d 개\n", gd.getName(), gd.getPrice(), gd.getQuantity());
			System.out.printf("총 구매 가격 : %d 원", gd.getPrice()*gd.getQuantity());
		}catch(Exception ex) {
			ex.toString();
		}
	}
}
