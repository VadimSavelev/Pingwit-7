package pl.pingvit.homework3;

public class Task8 {
    public static void main(String[] args) {
        int i;
        int coefficient = 2;
        int sumEven = 0;
        int sumOdd = 0;
        for (i = 0; i <= 100; i++) {
            if (i % coefficient == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        int sumAllNumbers = sumEven + sumOdd;
        System.out.println("Sum of odd numbers = " + sumEven);
        System.out.println("Sum of Even numbers = " + sumOdd);
        System.out.println("Sum of all numbers = " + sumAllNumbers);
    }
}
