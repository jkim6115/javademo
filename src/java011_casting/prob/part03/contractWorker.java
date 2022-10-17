package java011_casting.prob.part03;

public class contractWorker extends Employee {
	int workingDays;
	int chargePerDay;
	
	public contractWorker() {
		super();
	}

	public contractWorker(String name, String dept, String div, int workingDays, int chargePerDay) {
		super(name, dept, div);
		this.workingDays = workingDays;
		this.chargePerDay = chargePerDay;
	}
	
	public int pay() {
		return chargePerDay * workingDays;
	}
	
	@Override
	public String toString() {
		return super.toString() + pay();
	}
}
