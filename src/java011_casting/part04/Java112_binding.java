package java011_casting.part04;

public class Java112_binding {
	
	//결합도가(의존도가) 낮아졌다.
	public static void process(HomeTv tv) {
		tv.turnOn();
		tv.soundUp();
		if(tv instanceof LgTv) {
			LgTv lg = (LgTv)tv;
			lg.call();
		} else if(tv instanceof SamsungTv) {
			SamsungTv ss = (SamsungTv)tv;
			ss.move();
		}
	}
	
	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		process(lg);
		
		SamsungTv ss = new SamsungTv("Samsung");
		process(ss);
	}
}
