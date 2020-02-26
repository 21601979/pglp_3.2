package fr.uvsq.uvsq21601979._2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class employeTest 
{
	@Test
	public void testcalcSalaire()
	{
		employe a = new employe(10);
		assertEquals(1700,a.calcSalaire());
	}
}
