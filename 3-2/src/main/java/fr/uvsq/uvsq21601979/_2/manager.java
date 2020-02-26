package fr.uvsq.uvsq21601979._2;

public class manager extends employe
{
	int personel = 0;

	public manager(int années) 
	{
		super(années);
	}
	
	public void setPersonel(int val)
	{
		this.personel = val;
	}
	
	@Override
	public int calcSalaire()
	{
		return super.calcSalaire() + 100 * personel;
	}

}
