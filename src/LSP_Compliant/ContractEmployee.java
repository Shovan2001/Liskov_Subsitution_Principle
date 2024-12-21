package LSP_Compliant;

public class ContractEmployee extends Employee
{
	public ContractEmployee(Integer id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getSalary() {
		// TODO Auto-generated method stub
		return 50000d;
	}

}
