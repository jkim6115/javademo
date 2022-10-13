package java008_static_access.part01;

public class StaticEx {
	int x = 5;
	static int y = 10;
	
	public StaticEx() {
		
	}
	
	public String toString() {
		return String.format("x=%2d, y=%2d\n", x, y);
	}
}
