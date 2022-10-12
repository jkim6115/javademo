package java006_class.part08;

/*
 * 사원중에 부서가 결정되지 않은 경우 부서는 "보류", 급여는 3000으로
 * 기본겂으로 설정한다.
 */

public class Employess {
	String name;
	String dept;
	int salary;
	
	public Employess() {}
	
	public Employess(String name) {
		this("보류", 3000);
		this.name = name;
	}
	
	public Employess(int salary) {
		this.salary = salary;
	}
	
	public Employess(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
	}

	public Employess(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s %s %d\n", name, dept, salary);
	}
}
