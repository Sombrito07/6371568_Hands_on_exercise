package junit.setup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAddition() {
        int result = 5 + 10;
        assertEquals(15, result);
    }
}