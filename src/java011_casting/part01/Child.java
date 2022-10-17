package java011_casting.part01;

public class Child extends Parent{
	public Child() {
		// TODO Auto-generated constructor stub
	}
	
	void call() {
		System.out.println("Child call");
	}
	
	@Override
	void process() {
		System.out.println("Child process");
	}
}
