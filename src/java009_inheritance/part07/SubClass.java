package java009_inheritance.part07;

public class SubClass extends SuperClass {
	public SubClass() {
		// TODO Auto-generated constructor stub
	}
	
	public SubClass(int a, int b, int c) {
		super(a,b,c);
	}
	
	public void sumDate() {
		System.out.println("합 : "+ (x+y+z));
	}
}