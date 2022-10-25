package ncs.test09;

public class Airplane extends Plane {
	public Airplane() {
	
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		super.setFuelSize(getFuelSize() - (distance * 3));
	}
	
	@Override
	public void refuel(int fuel) {
		super.setFuelSize(getFuelSize() + fuel);
	}
}
