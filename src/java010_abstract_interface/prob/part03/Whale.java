package java010_abstract_interface.prob.part03;

public class Whale extends Fish implements Mammal {

	@Override
	public void bear() {
		// TODO Auto-generated method stub
		System.out.println("고래는 새끼를 낳습니다.");
	}
	
	@Override
	void swim() {
		// TODO Auto-generated method stub
		super.swim();
	}
	
}
