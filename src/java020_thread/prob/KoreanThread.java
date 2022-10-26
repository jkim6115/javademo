package java020_thread.prob;

public class KoreanThread extends Thread {
	private char[] arr = new char[] {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
	@Override
	public void run() {
		for(char ch : arr) {
			System.out.print(ch);
		}
	}
}
