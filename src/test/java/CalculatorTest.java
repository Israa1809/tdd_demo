import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testAdd(){
        System.out.println("Testing add method.....");
        Calculator calculator = new Calculator();
        int actual = calculator.add(2, 2);
        int expected = 4;
        assertEquals(expected, actual);
    }


}