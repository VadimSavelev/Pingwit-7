package pl.pingvit.homework3;

// ты придумал названия всем классам, кроме этого. предлагаю вариант OddEvenSumCalculator
public class Task8 {
    public static void main(String[] args) {
        int i;  // эту переменную можно не объявлять отдельно. достаточно объявить ее в строке 9
        int coefficient = 2; // в данном случае можно не выносить 2 в отдельную переменную. можно вынести проверку
        // i % coefficient == 0 в private метод, что-то типа
        // private boolean isEven(int number) { return number % 2 == 0 }
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
