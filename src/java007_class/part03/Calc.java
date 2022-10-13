package java007_class.part03;

public class Calc {
	int left;
	int right;
	char ope;
	
	public Calc() {}

	public Calc(int left, int right, char ope) {
		this.left = left;
		this.right = right;
		this.ope = ope;
	}
	
	public int process() {
		switch(ope) {
			case '+': return left + right;
			case '-': return left - right;
			case '/': return left / right;
			case '*': return left * right;
			default: return 0;
		}
	}
	
	public String toString() {
		return String.format("%2d %2c %2d = %d\n", left, ope, right, process());
	}
}
