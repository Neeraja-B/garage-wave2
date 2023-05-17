 import org.junit.Test;
 import static org.junit.Assert.*;
 import org.junit.Rule;
 import org.junit.jupiter.api.*;


 public class ExampleTest {

    @Test
    public void testProduct() {
        Example example = new Example();
        int a = 5, b = 10;
        int expectedProduct = 50;
        int actualProduct = example.getProduct(a, b);
        assertEquals(expectedProduct, actualProduct);
    }
    
 public static class WatchmanTest {
  private static String watchedLog;

  @Rule
  public TestWatcher watchman= new TestWatcher() {
      @Override
      protected void failed(Throwable e, Description description) {
          watchedLog+= description + "\n";
      }
  @Test
  public void fails() {
      fail();
}
