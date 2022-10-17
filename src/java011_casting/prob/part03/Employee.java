package java011_casting.prob.part03;

public class Employee {
	String name;
	String dept;
	String div;
	
	public Employee() {
		super();
	}

	public Employee(String name, String dept, String div) {
		super();
		this.name = name;
		this.dept = dept;
		this.div = div;
	}
	
	@Override
	public String toString() {
		return String.format("%-4s 총급여: ", name);
	}
}
