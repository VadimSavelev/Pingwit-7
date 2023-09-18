package pl.pingvit.homework4;

import java.util.Scanner;

// очень хорошо, осталось починить случай, когда размер = 9
public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size butterfly : ");
        int size = scanner.nextInt();
        for (int i = 0; i <= size; i++) {
            //верх
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            //промежуток
            for (int j = 0; j <= 2 * (size - i); j++) {
                System.out.print(" ");
            }
            //лево верх
            for (int j = i; j >=0 ; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
        for (int i = size; i >= 0; i--) {
            //низ право
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            //низ промеж2
            for (int j = 0; j <= 2 * (size - i); j++) {
                System.out.print(" ");
            }
            //низ лево2
            for (int j = i; j >=0 ; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}

