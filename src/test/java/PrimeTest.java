import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
@Test
     void isPrimeSholdReturnFalseIfTheElementIsLowerThenTwo(){
    Assertions.assertFalse(Prime.isPrime(-2));

}
    @Test
    void isPrimeSholdReturnTrueIfTheElementIsPrimeAndBigerThenTwo(){
        Assertions.assertTrue(Prime.isPrime(7));

    }
    @Test
    void isPrimeSholdReturnTrueTheElementIsnNotPrimeAndBigerThenTwo(){
        Assertions.assertFalse(Prime.isPrime(20));

    }
    @Test
    void isPrimeSholdReturnTrueTheElementEqualsTwoOrThree(){
        Assertions.assertTrue(Prime.isPrime(2));
        Assertions.assertTrue(Prime.isPrime(3));

    }
}