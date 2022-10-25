package ncs.test06;

public class Calculator {

	public double getSum(int data) {
		double result = 0;
		for(int i = 0; i <= data; i++) {
			result += i;
		}
		return result;
	}
}
