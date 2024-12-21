package LSP_Non_Compliant;

import java.util.List;

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

	@Override
	public Double calculateBonus() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Perks> getPerks() {
		// TODO Auto-generated method stub
		return null;
	}

}
