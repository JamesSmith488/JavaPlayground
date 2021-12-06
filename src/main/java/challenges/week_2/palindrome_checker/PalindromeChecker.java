package challenges.week_2.palindrome_checker;

public class PalindromeChecker {

    public boolean isPalindrome(String word){
        String palindromeWord = "";
        char[] letters = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
        }
        for (int j = word.length(); j > 0; j--) {
            palindromeWord += letters[j-1];
        }
        return (word.equals(palindromeWord));
    }

}
