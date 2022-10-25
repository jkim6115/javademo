package ncs.test04;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Product product = new Product();
		try (Scanner sc = new Scanner(System.in)) {
			String name = sc.nextLine();
			product.setName(name);

			int price = sc.nextInt();
			product.setPrice(price);

			int quantity = sc.nextInt();
			product.setQuantity(quantity);
		} catch (Exception e) {
			
		}
		System.out.println(product.infomation());
	}
}
