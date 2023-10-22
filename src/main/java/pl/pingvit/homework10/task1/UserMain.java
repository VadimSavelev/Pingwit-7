package pl.pingvit.homework10.task1;
import java.util.Scanner;
public class UserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username");
        String userName = scanner.nextLine();
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your surname");
        String surname = scanner.nextLine();
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        System.out.println("Enter your phone Number");
        String phone = scanner.nextLine();
        System.out.println("Enter your password");
        String password = scanner.nextLine();

        UserData user = new UserData(userName, name, surname, email, phone, password);
        System.out.println(user);

        UserValidator userValidator = new UserValidator();
        boolean checkUser = userValidator.isValid(user);
        System.out.println(checkUser);
    }
}
