package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint{

	private String color;

	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void reverse() {
		// TODO Auto-generated method stub
		
	}
	
	protected void show() {
		System.out.printf("%d,%d,%s", y,x,color);
	}
}
