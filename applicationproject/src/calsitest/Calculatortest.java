package calculator;

import org.junit.Test;

class calculatortest {

	@Test
	public void calTest() {
		assertEquals(31, calculator.add(11, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, calculator.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, calculator.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, calculator.div(30, 5));
	}

}