package java007_class.part01;

public class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;
	
	public Goods() {}

	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	public void display() {
		System.out.printf("%-14s %8d %5d %5d\n", name, price, numberOfStock, sold);
	}
}
