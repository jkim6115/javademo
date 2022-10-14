package java009_inheritance.prob.part05;

/*

드라마 제목, 방송사, 편수, 종영시기, 시즌2 제작여부

드라마 제목 : 라이프온마스, 방송사 : OCN  편수 :   16
드라마 제목 : 38사기동대, 방송사 : OCN  편수 :   16
드라마 제목 : 어느날 , 방송사 : 쿠팡플레이 편수 :    8
드라마 제목 : 산후조리원, 방송사 : tvN  편수 :    8
드라마 제목 : 비밀의숲, 방송사 : tvN  편수 :   16
==============================================
드라마 제목 : 라이프온마스, 방송사 : OCN  편수 : 16  , 종영시기 : 2018.08.05, 시즌2 여부 :    X
드라마 제목 : 어느날 , 방송사 : 쿠팡플레이 편수 : 8   , 종영시기 : 2021.12.19, 시즌2 여부 :    X
드라마 제목 : 비밀의숲, 방송사 : tvN  편수 : 16  , 종영시기 : 2017.07.30, 시즌2 여부 :    O

 */

public class Prob05_inheritance {
	public static void main(String[] args) {
		Drama[] drama = new Drama[5];
		drama[0] = new Drama("라이프온마스", "OCN", 16);
		drama[1] = new Drama("38사기동대", "OCN", 16);
		drama[2] = new Drama("어느날", "쿠팡플레이", 8);
		drama[3] = new Drama("산후조리원", "tvN", 8);
		drama[4] = new Drama("비밀의숲", "tvN", 16);
		for(int i = 0; i < drama.length; i++) {
			System.out.println(drama[i].toString());
		}
		
		System.out.println("==============================================");
		DramaWork[] dw = new DramaWork[3];
		dw[0] = new DramaWork("라이프온마스", "OCN", 16, "2018.08.05", 'X');
		dw[1] = new DramaWork("어느날", "쿠팡플레이", 8, "2021.12.19", 'X');
		dw[2] = new DramaWork("비밀의숲", "tvN", 16, "2017.07.30", 'O');
		for(int i = 0; i < dw.length; i++) {
			System.out.println(dw[i].toString());
		}
	}
}
