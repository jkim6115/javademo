package java020_thread.part02;

public class Java213_thread {
	public static void main(String[] args) {
		UserImp um = new UserImp();
		Thread th = new Thread(um);
		th.start();
		
		for(int j = 0; j <= 5; j++) {
			System.out.println();
			System.out.printf("%s i = %d\n",Thread.currentThread().getName(), j);
		}
	}
}
