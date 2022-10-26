package java020_thread.prob;

import java.util.Stack;

public class VendingMachine {
	Stack stack = new Stack();

	synchronized public String getDrink() {
		while(stack.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		return stack.pop().toString();
	}

	synchronized public void putDrink(String drink) {
		this.notify();
		stack.push(drink);
	}
}
