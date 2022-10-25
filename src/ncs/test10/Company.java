package ncs.test10;

public class Company {
	public static void main(String[] args) {
		Employee[] employee = new Employee[2];
		Secretary secretary = new Secretary("Hilery", 1, "secretary", 800);
		Sales sales = new Sales("Clinten", 2, "sales", 1200);
		employee[0] = secretary;
		employee[1] = sales;
		

		System.out.printf("%-10s %-10s %8s\n", "name","department" ,"salary");
		System.out.println("-------------------------------");
		for(Employee em : employee) {
			System.out.printf("%-10s %-10s %8d\n", em.getName(), em.getDepartment(), em.getSalay());
		}
		
		System.out.println();
		System.out.println("인센티브 100 지급");
		
		secretary.incentive(100);
		sales.incentive(100);
		System.out.printf("%-10s %-10s %8s %8s\n", "name","department" ,"salary", "tax");
		System.out.println("-----------------------------------------");
		for(Employee em : employee) {
			System.out.printf("%-10s %-10s %8d %8.1f\n", em.getName(), em.getDepartment(), em.getSalay(), em.tax());
		}
	}
}
