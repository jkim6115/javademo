package ncs.test07;

public class Student extends Human {
	private String number;
	private String major;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, int height, int weigh, String number, String major) {
		super(name, age, height, weigh);
		this.number = number;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%s %s", number, major);
	}
}
