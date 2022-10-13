package java007_class.part02;

public class Doctor {
	String name;
	String medical;
	int parient;
	
	public Doctor() {}
	
	public Doctor(String name, String medical, int parient) {
		this.name = name;
		this.medical = medical;
		this.parient = parient;
	}
	
	public String toString() {
		return String.format("%s %s %d\n", name, medical, parient);
	}
}
