import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(15, calculator.add(5, 10));
    }

    @Test
    public void subtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void multiply() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void divide() {
        assertEquals(2.00, calculator.divide(10.00, 5.00), 0.01);
    }

}
