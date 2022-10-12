package java006_class.part04;

public class MenuShop {
	String menu;
	int price;
	int cnt;
	
	int count() {
		return price * cnt;
	}
	
	void display() {
		System.out.println("메뉴명: "+menu);
		System.out.println("가격: "+price);
		System.out.println("주문갯수: "+cnt);
		System.out.println("금액: "+count());
		System.out.println();
	}	
}
