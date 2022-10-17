package java010_abstract_interface.part01;

//추상메소드는 추상클래스 안에서만 정의 가능
abstract public class CarAbs {
	int speed;
	String color;
	
	public CarAbs() {
		
	}
	
	abstract public void work(); //추상메소드
	
	public void display() {
		System.out.printf("%d %s\n", speed, color);
	}
}
