package ncs.test12;

public class Fruit {
	private String name;
	private int price;
	private int quantity;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, int price, int quantity) {
		super();
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
	
	@Override
	public String toString() {
		return String.format("%s, %d원, %d개", name, price, quantity);
	}
}
