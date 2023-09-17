package pl.pingvit.homework3;

public class SeriesOfTasks {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
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