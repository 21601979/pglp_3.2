package fr.uvsq.uvsq21601979._2;

public class employe 
{
	private int années;
	
	public employe(int années)
	{
		this.années = années;
	}
	
	public int calcSalaire()
	{
		return 1500 + 20*années;
	}
}
