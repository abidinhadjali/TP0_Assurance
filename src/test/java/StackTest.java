import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {



    @Test
    void pushShouldAddtElementToTopOfStack() {
        Stack  S = new Stack();
        S.push(5);

        Assertions.assertEquals(5, S.peek());
        Assertions.assertEquals(1, S.size());
    }

    @Test
    void pushShouldExpandArrayStackIfStackIsFull() {
        Stack  S = new Stack();
        for (int i = 0; i <10 ; i++) {
            S.push(i);
        }
        Assertions.assertEquals(10, S.size());
        S.push(3);
        Assertions.assertEquals(11, S.size());
        Assertions.assertEquals(3, S.peek());
    }

    @Test
    void popShouldReturnExptionIfTheStackIsEmpty(){
        Stack  S = new Stack();
        Assertions.assertThrows(  IllegalStateException.class,()->S.pop());
    }
    @Test
    void popShouldReturnThelastElementInStack(){
        Stack  S = new Stack();
        S.push(5);

        Assertions.assertEquals(5, S.pop());
        Assertions.assertEquals(0,S.size());
    }
    @Test
    void PeekShouldReturnExptionIfTheStackIsEmpty(){
        Stack  S = new Stack();
        Assertions.assertThrows(  IllegalStateException.class,()->S.peek());
    }
    @Test
    void PeekShouldReturnThelastElementInStack(){
        Stack  S = new Stack();
        S.push(5);
        Assertions.assertEquals(5, S.peek());
    }
     @Test
        void isEmptySholdReturnTrueIfStackIsEmpty() {
         Stack S = new Stack();
         Assertions.assertTrue(S.isEmpty());
    }
    @Test
    void SizesSholdReturnFalseIfStackIsNotEmpty(){
        Stack S = new Stack();
        S.push(5);
        Assertions.assertFalse(S.isEmpty());
    }

}
