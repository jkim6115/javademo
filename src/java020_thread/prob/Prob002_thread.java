package java020_thread.prob;

public class Prob002_thread {

	public static void main(String[] args) {
		EnglishLowerThread t1 = new EnglishLowerThread();
		EnglishUpperThread t2 = new EnglishUpperThread();
		KoreanThread t3 = new KoreanThread();

		t1.start();
		
//		t3.start();

		try {
			t1.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println();
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}// end main()

}// end class
