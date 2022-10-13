package java007_class.part04;

public class Insurance {
	String code;
	String name;
	String type;
	int payment;
	
	public Insurance() {}

	public Insurance(String code, String name, String type, int payment) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.payment = payment;
	}
	
	public String toString() {
		return String.format("%s %s %s %d\n", code, name, type, payment);
	}
}
