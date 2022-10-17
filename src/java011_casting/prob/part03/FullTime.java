package java011_casting.prob.part03;

public class FullTime extends Employee {
	int pay;
	int extraPay;
	
	public FullTime() {
		super();
	}

	public FullTime(String name, String dept, String div, int pay, int extraPay) {
		super(name, dept, div);
		this.pay = pay;
		this.extraPay = extraPay;
	}
	
	public int pay() {
		return pay + extraPay;
	}

	
	@Override
	public String toString() {
		return super.toString() + pay();
	}
}
