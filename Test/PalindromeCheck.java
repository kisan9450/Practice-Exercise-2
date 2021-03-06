import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeCheck {

    Palindrome p;
    @Before
    public void setUp() throws Exception {
        p = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        p = null;

    }

    @Test
    public void BasicTest() {
        boolean check = p.isPalindrome("madam");
        boolean answer = true;
        Assert.assertEquals(check, answer);
    }

    @Test
    public void AlphaNumericTest() {
        boolean check = p.isPalindrome("1cddc1");
        boolean answer = true;
        Assert.assertEquals(check, answer);
    }

    @Test
    public void LongStringTest(){
        boolean check = p.isPalindrome("1234tdfsdfas343543434343./fdgh");
        boolean answer = false;
        Assert.assertEquals(check, answer);
    }
}
