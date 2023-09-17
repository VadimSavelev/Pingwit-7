package pl.pingvit.homework3;

import java.util.Scanner;

public class CalculateWithoutMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value A: ");
        int a = scanner.nextInt();
        System.out.println("Please enter value B: ");
        int b = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += b;
        }
        System.out.println("Product of value A and B = " + result);
    }
}
