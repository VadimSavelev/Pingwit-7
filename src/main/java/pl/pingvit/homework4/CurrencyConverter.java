package pl.pingvit.homework4;

import java.util.Scanner;

/*Task 1
        Написать программу-конвертер валют. (гривна <-> евро в обе стороны)
        Пользователь вводит валюту первым шагом, вторым вводит сумму, на выходе получает сумму в другой валюте.
        Пример:
        Введите валюту:
        eur
        Введите сумму:
        20
        К выдаче 800 гривен

        Введите валюту:
        uah
        Введите сумму:
        800
        К выдаче 40 евро

        Если пользователь ввел не eur и не uah, вывести сообщение "валюта хх не поддерживается" и завершить выполнение программы
*/
public class CurrencyConverter {
    public static final double EURO_EXCHANGER_RATE = 39.32;
    public static final double UAH_EXCHANGER_RATE = 0.025;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name of your currency  : ");
        String nameOfCurrencyClient = scanner.next();
        System.out.println("Please enter your amount of money: ");
        double amountOfMoneyClient = scanner.nextDouble();
        switch (nameOfCurrencyClient) {
            case "eur":
                double uahAmount = amountOfMoneyClient * EURO_EXCHANGER_RATE;
                System.out.println("to the issue " + uahAmount + " uah");
                break;
            case "yah":
                double euroAmount = amountOfMoneyClient * UAH_EXCHANGER_RATE;
                System.out.println("to the issue " + euroAmount + " euro");
                break;
            default:
                System.out.println("currency " + nameOfCurrencyClient + " is not supported");
        }

    }
}
