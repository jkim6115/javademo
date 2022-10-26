package java020_thread.part06;

public class Bank implements Runnable {
	
	private AccountNumber an;
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public Bank(AccountNumber an) {
		this.an = an;
	}

	@Override
	public void run() {
		an.input();
		an.withDraw();
	}// end run()

	
}// end class
