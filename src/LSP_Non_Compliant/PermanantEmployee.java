package LSP_Non_Compliant;

import java.util.ArrayList;
import java.util.List;

public class PermanantEmployee extends Employee
{

	public PermanantEmployee(Integer id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getSalary() {
		// TODO Auto-generated method stub
		return 100000d;
	}

	@Override
	public Double calculateBonus() {
		// TODO Auto-generated method stub
		return 1.1*this.getSalary();
	}

	@Override
	public List<Perks> getPerks() {
		// TODO Auto-generated method stub
		List<Perks>perks=new ArrayList<Perks>();
		
		perks.add(Perks.CAR_ALLOWANCE);
		perks.add(Perks.LTA);
		perks.add(Perks.PF);
		
		return perks;
	}

}
