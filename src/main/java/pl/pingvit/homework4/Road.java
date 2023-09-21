package pl.pingvit.homework4;
import java.util.Scanner;
public class Road {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter travel time in second  : ");
        int time = scanner.nextInt();
        while (time != 0) {
            time--;
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j <= (10 - i); j++) {
                    System.out.print(" ");
                }
                System.out.println("|| | ||");
            }
            for (int i = 10; i >= 1; i--) {
                for (int j = 0; j < (10 - i); j++) {
                    System.out.print(" ");
                }
                System.out.println("|| | ||");
            }
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("program execution time " + elapsed + " ms");
        // hello
        // hello
    }
}
/*ываываываыва*/