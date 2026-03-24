package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CFTTest {

	@Test
	public void testCFT01() {
		assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(-1, 1, false));
	}

	@Test
	public void testCFT02() {
		assertEquals(3700, CaculateInsuranceFee.calculate_insurance_fee(20, 1, true));
	}

	@Test
	public void testCFT03() {
		assertEquals(800, CaculateInsuranceFee.calculate_insurance_fee(35, 10, false));
	}

	@Test
	public void testCFT04() {
		assertEquals(1500, CaculateInsuranceFee.calculate_insurance_fee(61, 5, false));
	}
}
