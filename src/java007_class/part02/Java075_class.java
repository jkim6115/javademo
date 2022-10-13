package java007_class.part02;

public class Java075_class {
	public static void main(String[] args) {
		Doctor[] dt = new Doctor[5];
		dt[0] = new Doctor("김병조", "외과", 39);
		dt[1] = new Doctor("이상만", "내과", 50);
		dt[2] = new Doctor("박상기", "피부과", 20);
		dt[3] = new Doctor("오상수", "내과", 25);
		dt[4] = new Doctor("윤달수", "피부과", 30);
		search(dt, "피부과");
	}
	
	public static void search(Doctor[] dt, String medical) {
		for(int i = 0; i < dt.length; i++) {
			if(dt[i].medical == medical) {
				System.out.printf(dt[i].toString());
			}
		}
	}
}
