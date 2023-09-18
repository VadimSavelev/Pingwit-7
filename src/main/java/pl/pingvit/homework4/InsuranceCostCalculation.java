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

import java.util.Scanner;

public class InsuranceCostCalculation {

    public static final double TARIFF_PER_CUBIC_CENTIMETER = 0.25;
    public static final double REGULAR_CUSTOMER_RATIO_IF_TRUE = 0.8;
    public static final double CUSTOMER_RATIO_IF_FALSE = 1;
    public static final double TRAFFIC_ACCIDENT_SURCHARGE_IF_TRUE = 1.2;
    public static final double TRAFFIC_ACCIDENT_SURCHARGE_IF_FALSE = 1;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter engine capacity in cm3  : ");
        int engineCapacity = scanner.nextInt();
        System.out.println("Please enter are your regular customer: ");
        boolean regularCustomer = scanner.nextBoolean();
        System.out.println("Please enter have you had any accidents?: ");
        boolean hadAccidents = scanner.nextBoolean();
        double volumePerTariff = engineCapacity * TARIFF_PER_CUBIC_CENTIMETER;
        clientStatus(regularCustomer);
        accidentCheck(hadAccidents);

        double client;
        client = volumePerTariff *clientStatus(regularCustomer) * accidentCheck(hadAccidents);
        System.out.println("your policy is worth " + client + " euro");
    }

    private static double accidentCheck(boolean hadAccidents) {
        double trafficAccidentSurcharge;
        if (hadAccidents) {
            trafficAccidentSurcharge = TRAFFIC_ACCIDENT_SURCHARGE_IF_TRUE;
        } else {
            trafficAccidentSurcharge = TRAFFIC_ACCIDENT_SURCHARGE_IF_FALSE;
        }
        return trafficAccidentSurcharge;
    }

    private static double clientStatus(boolean regularCustomer) {
       double customerRatio;
        if (regularCustomer) {
            customerRatio = REGULAR_CUSTOMER_RATIO_IF_TRUE;

        } else {
            customerRatio = CUSTOMER_RATIO_IF_FALSE;

        }
        return customerRatio;

    }
}