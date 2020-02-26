package fr.uvsq.uvsq21601979._2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class entrepriseTest 
{
	@Test
	public void testcalcSalaire()
	{
		employe a = new employe(10);
		manager b = new manager(10);
		vendeur c = new vendeur(10);
		b.setPersonel(10);
		c.addcomm(50);
		entreprise en = new entreprise();
		en.add(a);
		en.add(b);
		en.add(c);
		assertEquals(6150,en.calcSalaires());
	}
}
