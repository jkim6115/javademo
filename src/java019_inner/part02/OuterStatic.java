package java019_inner.part02;

public class OuterStatic {
	private int x;
	static private int y;

	static void call() {
		y = 9;
		System.out.println(y);
	}

	static class InnerStatic {
		int z;

		void prn() {
			// 비 static 외부 자원을 static 내부 클래스에서 참조할 수 없다.
			// 왜냐하면 당연하게도 비 static 외부 자원은 아직 생성되어있지 않기 때문이다.
			y = 20;
			z = 40;
			System.out.println("y : " + y + " z : " + z);
		}
	}
}
