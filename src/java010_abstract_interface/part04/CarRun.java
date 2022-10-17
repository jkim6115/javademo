package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5; //public static final (int) carCount = 5;
	//public CarRun() {}
//	static {};
	void prn(); //abstract public
//	void display() {}
	class Sun {	//public static class Sun {}
		public Sun() {
			System.out.println("Sun Constractor");
		}
	}
}
