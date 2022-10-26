package java020_thread.part04;

/*
 *	스레드의 우선 순위는 1 - 10 까지 저장할 수 있다.
 *	스레드의 기본값은 5이다.
 *	Thread.MAX_PRIORITY = 10;
 *	Thread.NORM_PRIORUTY = 5;
 *	Thread.MIN_PRIORITY = 1;
 */

public class Java215_thread {
	public static void main(String[] args) {
		PriorityTest t1 = new PriorityTest();
		t1.start();
		
		PriorityTest t2 = new PriorityTest();
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		PriorityTest t3 = new PriorityTest();
		t3.setPriority(3);
		t3.start();
		
		PriorityTest t4 = new PriorityTest();
		t4.setName("user");
		t4.start();
		
		PriorityTest t5 = new PriorityTest();
		t5.setPriority(7);
		t5.setName("Test");
		t5.start();
	}
}
