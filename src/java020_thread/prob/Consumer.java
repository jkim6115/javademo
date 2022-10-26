package java020_thread.prob;

public class Consumer extends Thread {
	
	private VendingMachine vm; 
	
	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}
	
	@Override
	public void run() {
		for(int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + vm.getDrink() + "꺼내먹음");
			System.out.println();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
