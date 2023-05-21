import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BasicTests {

    @Test
    public void compare() {
        Basics basicTests = new Basics();
        int value = basicTests.compare(2, 1);
        Assertions.assertEquals(1, value);
    }

    @Test
    @DisplayName("First number is less than the second")
    public void compare2() {
        Basics basicTests = new Basics();
        int value = basicTests.compare(2, 3);
        Assertions.assertEquals(-1, value);
    }

    @Test
    @DisplayName("First number is equal to the second")
    public void compare3() {
        Basics basicTests = new Basics();
        int value = basicTests.compare(2, 2);
        Assertions.assertEquals(0, value);
    }
}
