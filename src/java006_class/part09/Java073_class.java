package java006_class.part09;

/*
 * Song클래스의 show()메소드를 아래와 같이 출력이 되도록 show() 메소드 구현
 * [실행결과]
 * 노래제목 : Dansing Queen
 * 가수 : ABBA
 * 앨범 : Arrival
 * 작곡가 : Benny Andersson, Bjorn Ulvaeus
 * 년도 : 1977
 * 트랙 : 2
 */

public class Java073_class {
	
	public static void main(String[] args) {
		Song sg = new Song("Dansing Queen", "ABBA", "Arrival", new String[] {"Benny Andersson", "Bjorn Ulvaeus"}, 1977, 2);
		sg.show();
	}

}
