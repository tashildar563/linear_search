import org.jUnit.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator=new Calculator();
    }
    @Test
    void getSumTest(){
        assertEquals(5,calculator.getSum(2,3));
    }
}
