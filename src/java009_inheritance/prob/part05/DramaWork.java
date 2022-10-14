package java009_inheritance.prob.part05;

public class DramaWork extends Drama{
	private String end;
	private char seasonTwoChk;
	
	public DramaWork() {
		
	}

	public DramaWork(String title, String broadcastStations, int number, String end, char seasonTwoChk) {
		super(title, broadcastStations, number);
		this.end = end;
		this.seasonTwoChk = seasonTwoChk;
	}
	
	@Override
	public String toString() {
		return String.format("드라마 제목 : %-4s, 방송사 : %-4s 편수 : %-4d, 종영시기 : %-4s, 시즌2 여부 : %4c", getTitle(), getBroadcastStations(), getNumber(), end, seasonTwoChk);
	}
}
