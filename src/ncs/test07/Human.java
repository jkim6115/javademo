package ncs.test07;

public class Human {
	private String name;
	private int age;
	private int height;
	private int weigh;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, int height, int weigh) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weigh = weigh;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d %d %d ", name, age, height, weigh);
	}
}
