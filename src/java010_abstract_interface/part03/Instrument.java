package java010_abstract_interface.part03;

abstract public class Instrument {
	String name;
	
	public Instrument() {
		
	}
	
	public Instrument(String name) {
		this.name = name;
	}
	
	abstract public void play();
}
