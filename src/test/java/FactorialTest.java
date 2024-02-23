import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialSholdRiseExeptionIfTheElementISNegative() {
        Assertions.assertThrows(  IllegalArgumentException.class,()->Factorial.factorial(-2));
    }
    @Test
    void factorialShouldReturnTheRightTermeIffTheElemntIsBigerThenZero(){

        Assertions.assertEquals(0, Factorial.factorial(100));

    }+
}