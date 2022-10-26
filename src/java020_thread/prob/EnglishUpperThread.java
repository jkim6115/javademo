package java020_thread.prob;

public class EnglishUpperThread extends Thread {
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}
}
