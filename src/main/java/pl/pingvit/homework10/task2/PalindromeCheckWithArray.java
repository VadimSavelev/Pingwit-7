package pl.pingvit.homework10.task2;
import java.util.Arrays;
public class PalindromeCheckWithArray {
    public boolean isPalindrome(String word) {
        char[] wordChars = word.toCharArray();
        char[] reversedChars = new char[wordChars.length];
        for (int i = wordChars.length - 1; i >= 0; i--) {
            reversedChars[wordChars.length - 1 - i] = wordChars[i];
        }
        return Arrays.equals(wordChars, reversedChars);
    }
}