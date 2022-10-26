package java020_thread.prob;

public class EnglishLowerThread extends Thread {

	@Override
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}
}
