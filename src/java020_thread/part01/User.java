package java020_thread.part01;

public class User extends Thread {
	public User() {
		
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			//Thread로 돌려야 할 실행문 작성
			System.out.printf("%s i = %d\n",getName(), i);
		}
	}
}// end class
