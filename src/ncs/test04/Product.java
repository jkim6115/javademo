package ncs.test04;

public class Product {
	private String name;
	private int price;
	private int quantity;

	public Product() {
	
	}

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String infomation() {
		return String.format("상품명 : %s\n가격 : %d 원\n수량 : %s 개\n총 구매 가격 : %d 원\n", getName(), getPrice(), getQuantity(), getPrice() * getQuantity());
	}
}
