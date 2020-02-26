package fr.uvsq.uvsq21601979._2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class managerTest
{
	@Test
	public void testcalcSalaire()
	{
		manager a = new manager(10);
		a.setPersonel(10);
		assertEquals(2700,a.calcSalaire());
	}
}
