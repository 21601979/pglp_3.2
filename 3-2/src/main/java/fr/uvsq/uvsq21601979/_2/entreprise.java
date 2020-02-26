package fr.uvsq.uvsq21601979._2;

import java.util.ArrayList;

public class entreprise 
{
	private ArrayList<employe> l;
	
	public entreprise()
	{
		l = new ArrayList<employe>();
	}
	
	public void add(employe e)
	{
		l.add(e);
	}
	
	public int calcSalaires()
	{
		int i;
		int cont = 0;
		for(i=0;i<l.size();i++)
		{
			cont = cont + l.get(i).calcSalaire();
		}
		return cont;
	}
}
