package pl.pingvit.homework4;

import java.math.BigDecimal;
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
    public static final BigDecimal UAH_EXCHANGER_RATE = BigDecimal.valueOf(0.025);
    public static final BigDecimal EURO_EXCHANGER_RATE = BigDecimal.valueOf(39.32);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name of your currency  : ");
        String CurrencyClient = scanner.next();
        System.out.println("Please enter your amount of money: ");
        BigDecimal amount = BigDecimal.valueOf(scanner.nextDouble());
        switch (CurrencyClient) {
            case "eur":
                BigDecimal uahAmount = amount.multiply(EURO_EXCHANGER_RATE);
                System.out.println("to the issue " + uahAmount + " uah");
                break;
            case "uah": // typo "uah"
                BigDecimal euroAmount = amount.multiply(UAH_EXCHANGER_RATE);
                System.out.println("to the issue " + euroAmount + " euro");
                break;
            default:
                System.out.println("currency " + CurrencyClient + " is not supported");
        }
    }
}
//  В целом все хорошо и решение рабочее. Я хотел бы, чтобы ты сделал второй вариант решения, где использовал бы
// не double, а BigDecimal и для суммы, которую введет клиент, и для рейтов, и для результата. Вычисления, касающиеся денег,
// в реальном коде не проводят через double - давай плиз попрактикуемся