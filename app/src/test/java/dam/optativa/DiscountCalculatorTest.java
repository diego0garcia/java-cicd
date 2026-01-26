package dam.optativa;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountCalculatorTest {
    @Test public void appCalcCorrectNotStudient() {
        assertEquals("The operation is not correct", 95, DiscountCalculator.calcDiscount(100.0, false), 0.01);
    }

    @Test public void appCalcCorrectIsStudient() {
        assertEquals("The operation is not correct", 80, DiscountCalculator.calcDiscount(100.0, true), 0.01);
    }
    
    @Test public void appCalcWithZeroNotStudient() {
        assertEquals("Zero money should return zero", 0, DiscountCalculator.calcDiscount(0.0, false), 0.01);
    }
    
    @Test public void appCalcWithZeroIsStudient() {
        assertEquals("Zero amount should return zero", 0, DiscountCalculator.calcDiscount(0.0, true), 0.01);
    }
    
    @Test public void appCalcWithDecimalNotStudient() {
        assertEquals("Decimal amount calculation for non-student", 47.975, DiscountCalculator.calcDiscount(50.5, false), 0.01);
    }
    
    @Test public void appCalcWithDecimalIsStudient() {
        assertEquals("Decimal amount calculation for student", 40.4, DiscountCalculator.calcDiscount(50.5, true), 0.01);
    }

    @Test public void appCalcWithNegativeNotStudient() {
        assertEquals("Decimal amount calculation for non-student", 0, DiscountCalculator.calcDiscount(-10.0, false), 0.01);
    }

    @Test public void appCalcWithNegativeIsStudient() {
        assertEquals("Decimal amount calculation for non-student", 0, DiscountCalculator.calcDiscount(-11.4, true), 0.01);
    }
}
