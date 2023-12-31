package pl.pingvit.homework4;
/*Написать программу для расчета стоимости страховки на автомобиль. Пользователь вводит объем двигателя в см3, постоянный клиент?
        были ли дтп? Тариф - 0.25 евро за см3, если клиент постоянный - скидка 20% (коэффициент 0.8), если были дтп - надбавка 20% (коэфф 1.2)

        Пример:  (1600*0.25*1.2*0.8=384)
        Введите объем двигателя в см3:
        1600
        Были ДТП за прошлый год?
        true
        Страховались у нас?
        true
        Ваш полис стоит 384 евро
*/

import java.math.BigDecimal;
import java.util.Scanner;

public class InsuranceCostCalculation {

    public static final BigDecimal TARIFF_PER_CUBIC_CENTIMETER = BigDecimal.valueOf(0.25);
    public static final BigDecimal REGULAR_CUSTOMER_RATIO_IF_TRUE = BigDecimal.valueOf(0.8);
    public static final BigDecimal CUSTOMER_RATIO_IF_FALSE = BigDecimal.valueOf(1);
    public static final BigDecimal TRAFFIC_ACCIDENT_SURCHARGE_IF_TRUE = BigDecimal.valueOf(1.2);
    public static final BigDecimal TRAFFIC_ACCIDENT_SURCHARGE_IF_FALSE = BigDecimal.valueOf(1);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter engine capacity in cm3  : ");
        BigDecimal engineCapacity = BigDecimal.valueOf(scanner.nextInt());
        System.out.println("Please enter are your regular customer: ");
        boolean regularCustomer = scanner.nextBoolean();
        System.out.println("Please enter have you had any accidents?: ");
        boolean hadAccidents = scanner.nextBoolean();
        BigDecimal volumePerTariff = engineCapacity.multiply(TARIFF_PER_CUBIC_CENTIMETER); // эту переменную вводить было необязательно. исправлять не нужно, просто на будущее
        BigDecimal totalCost = volumePerTariff.multiply(clientStatus(regularCustomer)).multiply(accidentCheck(hadAccidents));
        System.out.println("your policy is worth " + totalCost + " euro");
    }

    private static BigDecimal accidentCheck(boolean hadAccidents) {
        BigDecimal trafficAccidentSurcharge;
        if (hadAccidents) {
            trafficAccidentSurcharge = TRAFFIC_ACCIDENT_SURCHARGE_IF_TRUE;
        } else {
            trafficAccidentSurcharge = TRAFFIC_ACCIDENT_SURCHARGE_IF_FALSE;
        }
        return trafficAccidentSurcharge;
    }

    private static BigDecimal clientStatus(boolean regularCustomer) {
        BigDecimal customerRatio;
        if (regularCustomer) {
            customerRatio = REGULAR_CUSTOMER_RATIO_IF_TRUE;
        } else {
            customerRatio = CUSTOMER_RATIO_IF_FALSE;
        }
        return customerRatio;
    }
}//  В целом все хорошо и решение рабочее. Я хотел бы, чтобы ты сделал второй вариант решения, где использовал бы
// не double, а BigDecimal Вычисления, касающиеся денег,
// в реальном коде не проводят через double - давай плиз попрактикуемся
