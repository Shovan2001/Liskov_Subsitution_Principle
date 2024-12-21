package LSP_Non_Compliant;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	// Permanent employee gets salary,bonus,perks
	// Temporary employee gets less salary,less bonus,less perks
	// Contract employee gets salary,no bonus,no perks
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		PermanantEmployee permanantEmployee = new PermanantEmployee(1, "Ram");
		TemporaryEmployee temporaryEmployee = new TemporaryEmployee(1, "Madhu");
		ContractEmployee contractEmployee = new ContractEmployee(1, "Sam");

		employees.add(permanantEmployee);
		employees.add(temporaryEmployee);
		employees.add(contractEmployee);

		// getTotalSalary
		System.out.println("Total salary: " + EmployeeManager.fetchTotalSalary(employees));
		// getTotalBonus
		System.out.println("Total bonus: " + EmployeeManager.fetchTotalBonus(employees));

		// printPerksForEachEmployeeType
		printPerksForEachEmployeeType(employees);

	}

	private static void printPerksForEachEmployeeType(List<Employee> employees) {

		for (Employee employee : employees) {
			//WRONG WAY
			if (!(employee instanceof ContractEmployee)) {
				String allPerks = new String();
				for (Perks perks : employee.getPerks()) {
					allPerks += perks + " ";
				}
				System.out.println(employee.getClass().getSimpleName() + " Id: " + employee.getId() + " Name: " + employee.getName()
						+ " Perks: " + allPerks + "\n");
			}

		}

	}

	private static double fetchTotalSalary(List<Employee> employees) {
		Double totSalary = 0.0d;

		for (Employee employee : employees)
			totSalary += employee.getSalary();

		return totSalary;
	}

	private static double fetchTotalBonus(List<Employee> employees) {
		Double totBonus = 0.0d;

		for (Employee employee : employees) {
			// WRONG WAY
			if (!(employee instanceof ContractEmployee))
				totBonus += employee.calculateBonus();
		}
		return totBonus;
	}

}
