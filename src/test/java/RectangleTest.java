
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        int expected = 50;
        int result = rectangle.getArea();
        assertEquals(expected, result);
    }
}
