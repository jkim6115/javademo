package java009_inheritance.prob.part04;

public class HealthRate extends Health {

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);
	}

	private double standardHealth() {
		// 표준체중 로직구현을 구현하세요.
		double averageWeight;
		averageWeight = (height - 100) * 0.9;
		
		return averageWeight;
	}

	private String rateCheck() {
		// 비만도를 로직구현을 구현하세요
		double obesity;
		String rate;
		obesity = (weight - standardHealth()) / standardHealth() * 100;
		if(obesity < 10) {
			rate = "정상";
		} else if(obesity < 20) {
			rate = "과체중";
		} else {
			rate = "비만";
		}
		return rate;
	}

	// prn()메소드 오버라이딩
	@Override
	public void prn() {
		System.out.printf("%s님의 신장 %.0f , 몸무게 %.0f  %s입니다.\n", name, height, weight, rateCheck());
	}

}// end HealthRate