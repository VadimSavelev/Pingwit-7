package pl.pingvit.homework10.task2;
import java.util.Scanner;
public class PalindromeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word : ");
        String word = scanner.nextLine();

        PalindromeCheckWithStringUtils palindrome = new PalindromeCheckWithStringUtils();
        boolean isPalindrom = palindrome.isPalindrome(word);

        System.out.println(isPalindrom ? "This word is a palindrome!" : "This word is not a palindrome!");
    }
}
