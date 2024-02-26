import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void factorialSholdRiseExeptionIfTheElementISNegative() {
        Assertions.assertThrows(  IllegalArgumentException.class,()->Factorial.factorial(-2));
    }
    @Test
    void factorialShouldReturnOneIfTheElmentEqualeToZero(){

        Assertions.assertEquals(1, Factorial.factorial(0));

    }
    @Test
    void factorialShouldReturnTheRightTermeIffTheElemntIsBigerThenZero(){

        Assertions.assertEquals(120, Factorial.factorial(5));

    }
// this test is an additional test
    @Test
    void factorialShouldReturnTheRightTermIffTheElementIsTooLarge(){

        Assertions.assertEquals(0, Factorial.factorial(34));
        //this Test must be wrong because is not the factorial of 34 is not 0 of course

    }
}