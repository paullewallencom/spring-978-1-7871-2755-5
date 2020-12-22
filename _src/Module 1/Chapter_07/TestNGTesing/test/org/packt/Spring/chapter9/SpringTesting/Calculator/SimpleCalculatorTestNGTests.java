package org.packt.Spring.chapter9.SpringTesting.Calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleCalculatorTestNGTests {

	private SimpleCalculator simpleCalculator;

	@BeforeMethod
	public void beforeMethod() {
		simpleCalculator = new SimpleCalculatorImpl();
	}

	@Test
	public void verifyAdd() {
		long sum = simpleCalculator.add(3, 7);
		Assert.assertEquals(10, sum);
	}

//	@Test
	public void verifyAddFail() {
		long sum = simpleCalculator.add(3, 7);
		Assert.assertNotEquals(11, sum);
	}
}
