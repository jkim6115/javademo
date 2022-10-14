package java009_inheritance.prob.part05;

public class Drama {
	private String title;
	private String broadcastStations;
	private int number;
	
	public Drama() {
		
	}
	
	public Drama(String title, String broadcastStations, int number) {
		super();
		this.title = title;
		this.broadcastStations = broadcastStations;
		this.number = number;
	}
	
	public String toString() {
		return String.format("드라마 제목 : %-4s, 방송사 : %-4s 편수 : %4d", title, broadcastStations, number);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBroadcastStations() {
		return broadcastStations;
	}

	public void setBroadcastStations(String broadcastStations) {
		this.broadcastStations = broadcastStations;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
