package fr.uvsq.uvsq21601979._2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class vendeurTest 
{
	@Test
	public void testcalcSalaire()
	{
		vendeur a = new vendeur(10);
		a.addcomm(50);
		assertEquals(1750,a.calcSalaire());
	}
}
