package ncs.test10;

abstract public class Employee {
	private String name;
	private int number;
	private String department;
	private int salay;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int number, String department, int salay) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salay = salay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalay() {
		return salay;
	}

	public void setSalay(int salay) {
		this.salay = salay;
	}
	
	public double tax() {
		return salay / 0.1;
	}
}
