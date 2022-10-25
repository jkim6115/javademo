package ncs.test09;

public class PlaneTest {
	public static void main(String[] args) {
		Airplane airplane = new Airplane("L747", 1000);
		Cargoplane cargoplane = new Cargoplane("C40", 1000);
		System.out.println("Plane \t\t fuelSize");
		System.out.println("--------------------------");
		System.out.printf("%s \t\t %d\n", airplane.getPlaneName(), airplane.getFuelSize());
		System.out.printf("%s \t\t %d\n", cargoplane.getPlaneName(), cargoplane.getFuelSize());
		
		airplane.flight(100);
		cargoplane.flight(100);
		System.out.println("100 운항");
		
		System.out.println("Plane \t\t fuelSize");
		System.out.println("--------------------------");
		System.out.printf("%s \t\t %d\n", airplane.getPlaneName(), airplane.getFuelSize());
		System.out.printf("%s \t\t %d\n", cargoplane.getPlaneName(), cargoplane.getFuelSize());
		
		airplane.refuel(200);
		cargoplane.refuel(200);
		System.out.println("200 주유");
		
		System.out.println("Plane \t\t fuelSize");
		System.out.println("--------------------------");
		System.out.printf("%s \t\t %d\n", airplane.getPlaneName(), airplane.getFuelSize());
		System.out.printf("%s \t\t %d\n", cargoplane.getPlaneName(), cargoplane.getFuelSize());
	}
}
