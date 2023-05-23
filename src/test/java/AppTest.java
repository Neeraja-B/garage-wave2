
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestDemoClass {
    
    String input1= "noon";
    App app = new App();
    boolean expected=true;
    
    @Test
    public void isPalindromeTest() {
        assertEquals(expected, app.isPalindrome(input1));  
    }
    
     @Test
    public void isNotPalindromeTest() {
        assertEquals(false, app.isPalindrome(abc));       
    }
    
}

