package challenges.week_2.palindrome_checker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTests {

    @Test
    public void isPalindromeTest(){
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    public void isPalindromeTestFalse(){
        assertFalse(PalindromeChecker.isPalindrome("not a palindrome"));
    }

}
