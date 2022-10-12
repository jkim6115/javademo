package java006_class.part01;

public class Java065_class {
	public static void main(String[] args) {
//		Person ps; // 객체참조변수 선언
//		ps = new Person(); //객체 생성
		Person ps = new Person();
		
		ps.name = "홍길동";
		ps.age = 28;
		ps.gender = '남';
		ps.dev();
		ps.run(100);
		
		System.out.printf("%s %d %c\n\n", ps.name, ps.age, ps.gender);
		
		Person pn = new Person();
		
		pn.name = "김영희";
		pn.age = 26;
		pn.gender = '여';
		pn.dev();
		pn.run(100);
		System.out.printf("%s %d %c\n\n", pn.name, pn.age, pn.gender);
	}
}
