package part2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTests {
    @Test
    public void calculate_WithAddOperationArgument_ShouldReturnValidResult() {
        Calculator calc = new Calculator(6, 10, "+");
        assertEquals(16, calc.calculate(), 0.000001);
    }

    @Test
    public void calculate_WithAddOperationArgumentAndSmallNumbers_ShouldReturnValidResult() {
        Calculator calc = new Calculator(0.0001, 0.0002, "+");
        assertEquals(0.0003, calc.calculate(), 0.0000001);
    }

    @Test
    public void calculate_WithAddOperationArgumentAndLargeNumbers_ShouldReturnPositiveInfinityResult() {
        Calculator calc = new Calculator(Double.MAX_VALUE, Double.MAX_VALUE, "+");
        assertEquals(Double.POSITIVE_INFINITY, calc.calculate(), 0.00001);
    }

    @Test
    public void calculate_WithAddOperationArgumentAndSmallNumbers_ShouldReturnNegativeInfinityResult() {
        Calculator calc = new Calculator(Double.MIN_VALUE, Double.MIN_VALUE, "+");
        assertEquals(9.9E-324, calc.calculate(), 0.00001);
    }

    @Test
    public void calculate_WithLargeNegativeNumbers_ShouldReturnNegativeInfinity() {
        Calculator calc = new Calculator(-Double.MAX_VALUE, -Double.MAX_VALUE, "+");
        assertEquals(Double.NEGATIVE_INFINITY, calc.calculate(), 0.00001);
    }

    @Test
    public void calculate_WithSubtractOperationArgument_ShouldReturnValidResult() {
        Calculator calc = new Calculator(5, 3, "-");
        assertEquals(2, calc.calculate(), 0.0001);
    }

    @Test
    public void calculate_WithSubtractOperationArgumentAndDecimalValues_ShouldReturnValidResult() {
        Calculator calc = new Calculator(0.009, 0.003, "-");
        assertEquals(0.006, calc.calculate(), 0.0001);
    }


    @Test
    public void calculate_WithSubtractOperationArgumentAndNegativeValues_ShouldReturnValidResult() {
        Calculator calc = new Calculator(-5, -3, "-");
        assertEquals(-2, calc.calculate(), 0.0001);
    }


    @Test
    public void calculate_WithMultiplicationOperationArgument_ShouldReturnValidResult() {
        Calculator calc = new Calculator(5, 3, "*");
        assertEquals(15, calc.calculate(), 0.0001);
    }

    @Test
    public void calculate_WithMultiplicationOperationArgumentAndLargeNumbers_ShouldReturnPositiveInfinityResult() {
        Calculator calc = new Calculator(5, Double.MAX_VALUE, "*");
        assertEquals(Double.POSITIVE_INFINITY, calc.calculate(), 0.0001);
    }

    @Test
    public void calculate_WithMultiplicationOperationArgumentAndLargeNumbers_ShouldReturnNegativeInfinityResult() {
        Calculator calc = new Calculator(-5, Double.MAX_VALUE, "*");
        assertEquals(Double.NEGATIVE_INFINITY, calc.calculate(), 0.0001);
    }

    @Test
    public void calculate_WithDivisionOperationArgument_ShouldReturnValidResult() {
        Calculator calc = new Calculator(1, 3, "/");
        assertEquals(0.3333, calc.calculate(), 0.0001);
    }

    @Test
    public void calculate_WithDivisionOperationArgumentAndZero_ShouldThrowArithmeticException() {
        Calculator calc = new Calculator(6, 0, "/");
        Exception exception = assertThrows(ArithmeticException.class, calc::calculate);
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void calculate_WithDivisionOperationArgumentAndSmallNumbers_ShouldReturnNegativeInfinityResult() {
        Calculator calc = new Calculator(6, Double.MIN_VALUE, "/");
        assertEquals(Double.POSITIVE_INFINITY, calc.calculate(), 0.0001);
    }

    @Test
    public void calculate_WithInvalidOperationArgument_ShouldThrowArithmeticException() {
        Calculator calc = new Calculator(6, 3, "^");
        Exception exception = assertThrows(ArithmeticException.class, calc::calculate);
        assertEquals("Unsupported operation", exception.getMessage());
    }
}
