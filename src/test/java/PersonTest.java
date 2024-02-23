import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void getFullNameShouldReturnFullNameSepratedBySpace() {
        Person person = new Person("hadjali", "ahmed ", 22);
        String T = person.getFullName();
        Assertions.assertEquals("hadjali ahmed ", T);
    }
    @Test
    void isAdultShouldReturnTrueIfAgeIsGraterThanOrequals18() {
        Person person = new Person("hadjali", "ahmed ", 22);
        boolean T = person.isAdult();
        Assertions.assertTrue( T);
    }
    @Test
    void isAdultShouldReturnFalseIfAgeIsInderThan18() {
        Person person = new Person("hadjali", "ahmed ", 13);
        boolean T = person.isAdult();
        Assertions.assertFalse(T);
    }

}