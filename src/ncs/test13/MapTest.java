package ncs.test13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Inventory> map = new HashMap<String, Inventory>();

		String pattern = "yyyy년 MM월 dd일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7", sdf.parse("2016년 3월 15일"), 30));
			map.put("LG G5", new Inventory("LG G5", sdf.parse("2016년 2월 25일"), 20));
			map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", sdf.parse("2016년 1월 23일"), 15));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		for (Entry<String, Inventory> entry : map.entrySet()) {
			System.out.println(entry.getValue().toString());
		}
		
		Inventory[] inven = new Inventory[3];
		int i = 0;
		for (Entry<String, Inventory> entry : map.entrySet()) {
			inven[i++] = entry.getValue();
		}

		System.out.println();
		System.out.println("출고 수량 10 적용시--------------------");
		for (Inventory data : inven) {
			data.setGetDate(new Date()); 
			data.setGetAmount(10);
			System.out.println(data.toString());

		}

		System.out.println();
		System.out.println("출고수량 부족시--------------------------");
		for (Inventory data : inven) {
			data.setGetDate(new Date()); 
			data.setGetAmount(40); 
			try {
				if (data.getPutAmount() >= data.getGetAmount()) {
					System.out.println(data.toString());
				} else {
					throw new AmountNotEnough("현재 재고가 부족합니다 재고수량 확인하시기 바랍니다");
				}

			} catch (AmountNotEnough e) {
				break;
			}
		}
	}
}
