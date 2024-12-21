package LSP_Non_Compliant;

import java.util.ArrayList;
import java.util.List;

public class TemporaryEmployee extends Employee
{
	public TemporaryEmployee(Integer id, String name) {
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
		return 0.9*this.getSalary();
	}

	@Override
	public List<Perks> getPerks() {
		// TODO Auto-generated method stub
		List<Perks>perks=new ArrayList<Perks>();
		
		perks.add(Perks.PF);
		
		return perks;
	}

}
