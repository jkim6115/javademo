package ncs.test10;

public class Secretary extends Employee implements Bonus {
	public Secretary() {
		// TODO Auto-generated constructor stub
	}
	
	public Secretary(String name, int number, String department, int salay) {
		super(name, number, department, salay);
	}
	
	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return getSalay() * 0.1;
	}
	
	@Override
	public void incentive(int pay) {
		super.setSalay(getSalay() + (int)(pay * 0.8));
	}
}
