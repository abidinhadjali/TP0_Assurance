import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void fibonacciShouldRiseExptionIfTheTheElemntIsLLowerExactlyThenZero(){

        Assertions.assertThrows(  IllegalArgumentException.class,()->Fibonacci.fibonacci(-1));
    }
    @Test
    void fibounacciShouldReturnZeroIfTheElemntIsZero(){

        Assertions.assertEquals(0, Fibonacci.fibonacci(0));

    }
    @Test
    void fibounacciShouldReturnOneIfTheElemntIsOne(){

        Assertions.assertEquals(1, Fibonacci.fibonacci(1));

    }
    @Test
    void fibounacciShouldReturnTheRightResultIfTheElemntIsBigerthenOne(){

        Assertions.assertEquals(2,Fibonacci.fibonacci(3));

    }
}