import static org.junit.Assert.*;  
import org.junit.Test;
public class TestDemoClass {  
TestDemoClass obj=new TestDemoClass();   
@Test  
public void testSum() {  
    assertEquals(25,obj.sum(10, 15));  
         }  
}  
