package java006_class.part03;

public class Rect {
	int width;
	int height;
	String color;
	
	int area() {
		return width * height; //넓이
	}
	
	int grith() {
		return (width + height)*2; //둘레
	}
	
	void display() {
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("색상 : " + color);
		System.out.println("넓이 : " + area());
		System.out.println("둘레 : " + grith());
	}
}
