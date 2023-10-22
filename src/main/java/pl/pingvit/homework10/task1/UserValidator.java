package pl.pingvit.homework10.task1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserValidator {
    private static final Pattern LETTERS_ONLY = Pattern.compile("[a-zA-Z]*");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private static final Pattern DIGIT_ONLY = Pattern.compile("^\\d*");
    public boolean isValid(UserData user) {
        if ((user.userName().isEmpty())) {
            System.out.println("field Username is required");
            return false;
        }
        Matcher nameMatcher = LETTERS_ONLY.matcher(user.name());
        if (!nameMatcher.matches()) {
            System.out.printf("The name can only contain letters. You entered an incorrect name:%s %n", user.name());
            return false;
        }
        Matcher surnameMatcher = LETTERS_ONLY.matcher(user.surname());
        if (!surnameMatcher.matches()) {
            System.out.printf("Surname can only contain letters. You entered an incorrect last name:%s ", user.surname());
            return false;
        }
        Matcher emailMatcher = EMAIL_PATTERN.matcher(user.email());
        if (!emailMatcher.matches()) {
            System.out.printf("You entered an incorrect email %s ", user.email());
            return false;
        }
        Matcher phoneMatcher = DIGIT_ONLY.matcher(user.phoneNumber());
        if (!phoneMatcher.matches()) {
            System.out.printf("The phone number can only contain numbers. You entered an incorrect number: %s", user.phoneNumber());
            return false;
        }
        if ((user.password().isEmpty())) {
            System.out.println("Password cannot be an empty string");
            return false;
        }
        return true;
    }
}
