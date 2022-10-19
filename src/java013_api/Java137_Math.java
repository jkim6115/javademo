package java013_api;

import static java.lang.Math.*;

import java.util.Arrays;

public class Java137_Math {
	public static void main(String[] args) {
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)floor(random()*10) + 1;
			
			//중복체크
			for(int j = 0; j < i; j++) {
				if(num[j]==num[i]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(num);
		for(int data : num)
			System.out.printf("%4d", data);
	}
}
