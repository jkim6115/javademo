package ncs.test11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int num = random.nextInt(100) + 1;
			list.add(num);
		}
		System.out.print("정렬전 : ");
		display(list);
		list.sort(new Decending());
		System.out.print("정렬후 : ");
		display(list);
	}

	public static void display(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d ", list.get(i));
		}
		System.out.println();
	}
}
