package java009_inheritance.prob.part02;

public class StudentExam {
	String name;
	int age;
	int height;
	int weight;
	String studentId;
	
	public StudentExam(String name, int age, int height, int weight, String studentId) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.studentId = studentId;
	}
	
	public String toString() {
		return String.format("%-4s %2d %4d %4d %4s", name, age, height, weight, studentId);
	}
}
