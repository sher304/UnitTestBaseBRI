import org.example.Calculator;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator(5, 0 , "/");
    @Test
    public void testDivisionCalculation() {
        Exception exception = assertThrows(Exception.class, () -> {
            calculator.division();
        });
        assertEquals("Zero division error!", exception.getMessage());
    }

    @Test
    public void correctnessOfAdditionCalculation() {
        calculator.setB(5);
        assertEquals(10, calculator.addition(), "Addition of 5 + 5 = 10!");
    }

    @Test
    public void correctnessOfSubtractionCalculation(){
        calculator.setA(10);
        calculator.setB(5);
        assertEquals(5, calculator.subtraction(), "Subtraction of 10 - 5 = 5!");
    }

    @Test
    public void multiplicationCorrectnessCalculation() {
        calculator.setA(10);
        calculator.setB(5);
        assertEquals(50, calculator.multiplication(), "Multiplication 10 * 5 = 50!");
    }

    @Test
    public void divisionCorrectnessCalculation(){
        calculator.setA(10);
        calculator.setB(5);
        try {
            assertEquals(2, calculator.division(),  "Division 10 / 5 = 2!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void additionWithNegativeNumberCalculation() {
        calculator.setA(-5);
        calculator.setB(2);
        assertEquals(-3, calculator.addition(), "Addition -5 + 2 = -3!");
    }

    @Test
    public void additionWithNegativeNumbersCalculation() {
        calculator.setA(-5);
        calculator.setB(-2);
        assertEquals(-7, calculator.addition(), "subtraction -5 + (-2) = -7!");
    }

    @Test
    public void multiplicationWithNegativeNumberCalculation() {
        calculator.setA(-5);
        calculator.setB(-2);
        assertEquals(10, calculator.multiplication(), "multiplication -5 * (-2) = 10!");
    }

    @Test
    public void divisionWithNegativeNumberCalculation() {
        calculator.setA(-15);
        calculator.setB(-3);
        try {
            assertEquals(5, calculator.division(), "division -15 / (-3) = 5!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void multiplicationWithZeroNumberCalculation() {
        calculator.setA(0);
        calculator.setB(2);
        assertEquals(0, calculator.multiplication(), "multiplication 0 * 2 = 0!");
    }

    @Test
    public void testAdditionWithLargeNumbers() {
        calculator.setA(Double.MAX_VALUE);
        calculator.setB(Double.MAX_VALUE);
        assertTrue(Double.isInfinite(calculator.addition()),
                "Double.MAX_VALUE + Double.MAX_VALUE = Infinity!");
    }

    @Test
    public void testDivisionResultingInInfinity() throws Exception {
        calculator.setA(5);
        calculator.setB(Double.MIN_VALUE);
        assertTrue(Double.isInfinite(calculator.division()), "Division by a very small number = Infinity!");
    }

    @Test
    public void testOperationWithNaN() {
        calculator.setA(Double.NaN);
        calculator.setB(5);
        assertTrue(Double.isNaN(calculator.addition()), "NaN + 5 = NaN!");
    }

    @Test
    public void testSymbolGetterSetter() {
        calculator.setSymbol("+");
        assertEquals("+", calculator.getSymbol());
    }

    @Test
    public void testToStringFormat() {
        calculator.setA(3);
        calculator.setB(4);
        calculator.setSymbol("*");
        assertEquals("3.0 * 4.0", calculator.toString());
    }

}
