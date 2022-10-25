package ncs.test09;

public class Cargoplane extends Plane{
	public Cargoplane() {

	}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		super.setFuelSize(getFuelSize() - (distance * 5));
	}
	
	@Override
	public void refuel(int fuel) {
		super.setFuelSize(getFuelSize() + fuel);
	}
}
