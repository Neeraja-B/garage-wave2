
import static org.junit.Assert.*;
import org.junit.Test;

public class TestDemoClass {
    DemoClass obj = new DemoClass();
    @Test
    public void testsum() {
       
        assertEquals(25,obj.sum(10,15));
    }
}
