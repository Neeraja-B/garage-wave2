import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest{
@Test
  public void testLogin1()
  {
     Assert.assertEquals(0,App.userLogin("abc","abc123"));
  }
 @Test
   public void testLogin2()
  {
     Assert.assertEquals(1,App.userLogin("abc","abc@123"));
  }
}
