package my;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTester {

	@Test
	public void testCalculate() {
		//fail("Not yet implemented");
		Calculator calc = new Calculator();
		assertEquals(12, calc.calculate(4, 3));
	}

}
