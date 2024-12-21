package LSP_Compliant;

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
		List<IEmployeeSpecialAllowance> specialAllowancesemployee = new ArrayList<IEmployeeSpecialAllowance>();
		specialAllowancesemployee.add(temporaryEmployee);
		specialAllowancesemployee.add(permanantEmployee);
		// cannot add contract employees
		// gives compilation error
		System.out.println("Total bonus: " + EmployeeManager.fetchTotalBonus(specialAllowancesemployee));

		// printPerksForEachEmployeeType
		printPerksForEachEmployeeType(specialAllowancesemployee);

	}

	private static void printPerksForEachEmployeeType(List<IEmployeeSpecialAllowance> specialAllowancesemployee) {

		for (IEmployeeSpecialAllowance employee : specialAllowancesemployee) {
			String allPerks = new String();
			for (Perks perks : employee.getPerks()) {
				allPerks += perks + " ";
			}
			System.out.println(employee.getClass().getSimpleName()+" Corrected " + " Perks: " + allPerks + "\n");
		}

	}

	private static double fetchTotalSalary(List<Employee> employees) {
		Double totSalary = 0.0d;

		for (Employee employee : employees)
			totSalary += employee.getSalary();

		return totSalary;
	}

	private static double fetchTotalBonus(List<IEmployeeSpecialAllowance> employees) {
		Double totBonus = 0.0d;

		for (IEmployeeSpecialAllowance employee : employees) {
			totBonus += employee.calculateBonus();
		}
		return totBonus;
	}

}
