package java010_abstract_interface.part02;

public class Rect extends Shape{
	public Rect() {
		
	}
	
	public Rect(int width, int height) {
		super(width, height);
	}
	
	@Override
	double getArea() {
		return getWidth() * getHeight();
	}
}
