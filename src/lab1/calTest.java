package lab1;

import org.junit.Assert;
import org.junit.Test;

public class calTest {
	
	@Test
	public void testCombination() {
		cal c = new cal();
		int result = c.combination(76);
		Assert.assertEquals(result, 1);		
	}

}