package pl.pingvit.homework20;
import java.util.ArrayList;
import java.util.Scanner;
public class CheckingTheListOfInvitees {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Maksim");
        names.add("Viktor");
        names.add("Anna");
        names.add("Inna");
        names.add("Vadim");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please,enter your name: ");

        if ((names.contains(scanner.nextLine()))) {
            System.out.println("welcome, you're on the list!");
        } else {
            System.out.println("come next time, you are not on the list.");
        }
    }
}
