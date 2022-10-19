package java013_api;

import static java.lang.Math.*;

public class Java135_Math {
	public static void main(String[] args) {
		//범위 값 :	0 <= e < 1.0
		double ran = random();
		System.out.println(ran);
		
		//0.0 <= x < 10
		ran = ran * 10;
		System.out.println(ran);
		
		//0 ~ 9
		int num = (int)floor(ran);
		System.out.println(num);
		
		num += 1;
		System.out.println(num);
		
		System.out.println("========================================");
		System.out.println(((int)(floor(random()*10)))+1);
	}
}
