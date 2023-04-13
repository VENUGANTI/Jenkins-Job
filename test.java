import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    @Test
    public void testAddition() {
        int num1 = 5;
        int num2 = 10;

        int expectedSum = 15;
        int actualSum = SimpleCalculator.add(num1, num2);

        Assertions.assertEquals(expectedSum, actualSum, "Addition test failed!");
    }
}

class SimpleCalculator {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
