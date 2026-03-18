package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecisionTableTest {

    @Test
    public void testR1() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(17, 0, false));
    }

    @Test   
    public void testR2() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(101, 0, false));
    }

    @Test
    public void testR3() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(20, -1, false));
    }

    @Test
    public void testR4() {
        assertEquals(3700, CaculateInsuranceFee.calculate_insurance_fee(20, 1, true));
    }

    @Test
    public void testR5() {
        assertEquals(3000, CaculateInsuranceFee.calculate_insurance_fee(20, 1, false));
    }

    @Test
    public void testR6() {
        assertEquals(3200, CaculateInsuranceFee.calculate_insurance_fee(24, 4, true));
    }

    @Test
    public void testR7() {
        assertEquals(2500, CaculateInsuranceFee.calculate_insurance_fee(24, 4, false));
    }

    @Test
    public void testR8() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(20, 10, false));
    }

    @Test
    public void testR9() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(40, -1, false));
    }

    @Test
    public void testR10() {
        assertEquals(2200, CaculateInsuranceFee.calculate_insurance_fee(30, 1, true));
    }

    @Test
    public void testR11() {
        assertEquals(1500, CaculateInsuranceFee.calculate_insurance_fee(30, 1, false));
    }

    @Test
    public void testR12() {
        assertEquals(1700, CaculateInsuranceFee.calculate_insurance_fee(40, 5, true));
    }

    @Test
    public void testR13() {
        assertEquals(1000, CaculateInsuranceFee.calculate_insurance_fee(40, 5, false));
    }

    @Test
    public void testR14() {
        assertEquals(1500, CaculateInsuranceFee.calculate_insurance_fee(45, 12, true));
    }

    @Test
    public void testR15() {
        assertEquals(800, CaculateInsuranceFee.calculate_insurance_fee(45, 12, false));
    }

    @Test
    public void testR16() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(40, 30, false));
    }

    @Test
    public void testR17() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(70, -1, false));
    }

    @Test
    public void testR18() {
        assertEquals(2700, CaculateInsuranceFee.calculate_insurance_fee(70, 1, true));
    }

    @Test
    public void testR19() {
        assertEquals(2000, CaculateInsuranceFee.calculate_insurance_fee(70, 1, false));
    }

    @Test
    public void testR20() {
        assertEquals(2200, CaculateInsuranceFee.calculate_insurance_fee(70, 5, true));
    }

    @Test
    public void testR21() {
        assertEquals(1500, CaculateInsuranceFee.calculate_insurance_fee(70, 5, false));
    }

    @Test
    public void testR22() {
        assertEquals(2000, CaculateInsuranceFee.calculate_insurance_fee(70, 15, true));
    }

    @Test
    public void testR23() {
        assertEquals(1300, CaculateInsuranceFee.calculate_insurance_fee(70, 15, false));
    }

    @Test
    public void testR24() {
        assertEquals(-1, CaculateInsuranceFee.calculate_insurance_fee(70, 60, false));
    }
}
