package fr.uvsq.uvsq21601979._2;

public class vendeur extends employe
{
	int comm = 0;
	public vendeur(int années) 
	{
		super(années);
	}
	
	public void addcomm(int val)
	{
		this.comm = val;
	}
	
	@Override 
	public int calcSalaire()
	{
		return super.calcSalaire() + comm;
	}
}
