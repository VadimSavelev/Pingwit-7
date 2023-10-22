package pl.pingvit.homework10.task2;
import org.apache.commons.lang3.StringUtils;
public class PalindromeCheckWithStringUtils {
    public boolean isPalindrome(String word) {
        String reversWord = StringUtils.reverse(word);
        return reversWord.equals(word);
    }
}
