package java009_inheritance.part08;

public class OwnerEngin extends Car {
	private int seat;
	
	public OwnerEngin() {}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	void information() {
		System.out.println(seat+"인승 차량입니다.");
	}
}
