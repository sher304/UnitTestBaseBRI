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
        assertEquals(calculator.multiplication(), 50, "Multiplication 10 * 5 = 50!");
    }

    @Test
    public void divisionCorrectnessCalculation(){
        calculator.setA(10);
        calculator.setB(5);
        try {
            assertEquals(calculator.division(), 2, "Division 10 / 5 = 2!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
