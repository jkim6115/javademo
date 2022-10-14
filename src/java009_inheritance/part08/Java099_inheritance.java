package java009_inheritance.part08;

public class Java099_inheritance {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.setWater(1000);
		fe.setSpeed(100);
		fe.setColor("RED");
		fe.waterSpread();
		System.out.println(fe.toString());
		
		OwnerEngin oe = new OwnerEngin();
		oe.setSeat(8);
		oe.information();
		oe.setSpeed(80);
		oe.setColor("BLACK");
		System.out.println(oe.toString());
	}
}
