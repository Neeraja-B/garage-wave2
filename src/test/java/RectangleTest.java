import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(5, 4);
        int expectedArea = 20;
        int actualArea = rectangle.getArea();
        assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testGetLength() {
        Rectangle rectangle = new Rectangle(5, 4);
        int expectedLength = 5;
        int actualLength = rectangle.getLength();
        assertEquals(expectedLength, actualLength);
    }
}
