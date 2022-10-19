package java013_api;

import java.util.Scanner;

public class Java147_Wrapper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String line = sc.next();
		
		String[] data = line.split(",");
		System.out.println("이름:" + data[0]);
		System.out.println("국어:"+data[1]);
		System.out.println("영어:"+data[2]);
		double avg = (Double.parseDouble(data[1]) + Double.parseDouble(data[2]))/2;
		System.out.println("평균:"+avg);
		
	}
}
