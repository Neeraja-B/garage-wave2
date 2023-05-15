import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void testProduct() {
        Example example = new Example();
        int a = 5, b = 10;
        int expectedProduct = 50;
        int actualProduct = example.getProduct(a, b);
        assertEquals(expectedProduct, actualProduct);
    }
}
