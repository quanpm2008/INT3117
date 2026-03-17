package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoundaryValueTest {

    

    @Test
    public void testTC00()  {
        assertEquals(1000, CaculateInsuranceFee.calculate_insurance_fee(40, 5, false));
    }

    @Test
    public void testTC01() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(17, 0, false));
    }

    @Test
    public void testTC02() {
        assertEquals(3000, CaculateInsuranceFee.calculate_insurance_fee(18, 0, false));
    }

    @Test
    public void testTC03() {
        assertEquals(3000, CaculateInsuranceFee.calculate_insurance_fee(19, 1, false));
    }

    @Test
    public void testTC04() {
        assertEquals(1500, CaculateInsuranceFee.calculate_insurance_fee(99, 5, false));
    }

    @Test
    public void testTC05() {
        assertEquals(1500, CaculateInsuranceFee.calculate_insurance_fee(100, 5, false));
    }

    @Test
    public void testTC06() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(101, 5, false));
    }

    @Test
    public void testTC07() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(40, -1, false));
    }

    @Test
    public void testTC08() {
        assertEquals(1500, CaculateInsuranceFee.calculate_insurance_fee(40, 0, false));
    }

    @Test
    public void testTC09() {
        assertEquals(800, CaculateInsuranceFee.calculate_insurance_fee(40, 21, false));
    }

    @Test
    public void testTC10() {
        assertEquals(800, CaculateInsuranceFee.calculate_insurance_fee(40, 22, false));
    }

    @Test
    public void testTC11() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(40, 23, false));
    }

    @Test
    public void testTC12() {
        assertEquals(2500, CaculateInsuranceFee.calculate_insurance_fee(24, 5, false));
    }

    @Test
    public void testTC13() {
        assertEquals(1000, CaculateInsuranceFee.calculate_insurance_fee(25, 5, false));
    }

    @Test
    public void testTC14() {
        assertEquals(1000, CaculateInsuranceFee.calculate_insurance_fee(60, 5, false));
    }

    @Test
    public void testTC15() {
        assertEquals(1500, CaculateInsuranceFee.calculate_insurance_fee(61, 5, false));
    }

    @Test
    public void testTC16() {
        assertEquals(1500, CaculateInsuranceFee.calculate_insurance_fee(40, 1, false));
    }

    @Test
    public void testTC17() {
        assertEquals(1000, CaculateInsuranceFee.calculate_insurance_fee(40, 2, false));
    }

    @Test
    public void testTC18() {
        assertEquals(1000, CaculateInsuranceFee.calculate_insurance_fee(40, 9, false));
    }

    @Test
    public void testTC19() {
        assertEquals(800, CaculateInsuranceFee.calculate_insurance_fee(40, 10, false));
    }

    @Test
    public void testTC20() {
        assertEquals(1700, CaculateInsuranceFee.calculate_insurance_fee(40, 5, true));
    }
}
