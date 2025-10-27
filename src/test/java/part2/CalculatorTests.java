package part2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTests {
    @Test
    public void additionTest() {
        Calculator calc = new Calculator(0.0001, 0.0002, "+");
        assertEquals(0.0003, calc.calculate(), 0.0000001);
    }

    @Test
    public void subtractionTest() {
        Calculator calc = new Calculator(-5, 3, "-");
        assertEquals(-8, calc.calculate(), 0.0001);
    }

    @Test
    public void multiplicationTest() {
        Calculator calc = new Calculator(5, 3, "*");
        assertEquals(15, calc.calculate(), 0.0001);
    }

    @Test
    public void divisionTest() {
        Calculator calc = new Calculator(1, 3, "/");
        assertEquals(0.3333, calc.calculate(), 0.0001);
    }

    @Test
    public void divisionByZeroTest() {
        Calculator calc = new Calculator(6, 0, "/");
        Exception exception = assertThrows(ArithmeticException.class, calc::calculate);
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void unsupportedOperationTest() {
        Calculator calc = new Calculator(6, 3, "^");
        Exception exception = assertThrows(ArithmeticException.class, calc::calculate);
        assertEquals("Unsupported operation", exception.getMessage());
    }
}
