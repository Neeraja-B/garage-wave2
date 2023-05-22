import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assert;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int expectedSum = 5;
        int actualSum = calculator.add(2, 3);
        assertEquals(expectedSum, actualSum);
    }
}
