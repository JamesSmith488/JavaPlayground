package challenges.week_2.palindrome_checker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTests {

    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void isPalindromeTest(){
        assertTrue(palindromeChecker.isPalindrome("racecar"));
    }

    @Test
    public void isPalindromeTestFalse(){
        assertFalse(palindromeChecker.isPalindrome("not a palindrome"));
    }

}
