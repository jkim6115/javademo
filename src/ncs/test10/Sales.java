package ncs.test10;

public class Sales extends Employee implements Bonus {
	public Sales() {
		// TODO Auto-generated constructor stub
	}
	
	public Sales(String name, int number, String department, int salay) {
		super(name, number, department, salay);
	}

	@Override
	public void incentive(int pay) {
		super.setSalay(getSalay() + (int)(pay * 1.2));		
	}
	
	@Override
	public double tax() {
		return getSalay() * 0.13;
	}
}
