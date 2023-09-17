package pl.pingvit.homework3;

public class DistanceConversionTable {

    public static final double ONE_INCH_IN_CENTIMETERS = 2.54;

    public static void main(String[] args) {
        float result = 0;
        for (int inch = 1; inch <= 20; inch++) {
            result += ONE_INCH_IN_CENTIMETERS;
            System.out.println(inch + " inch = " + result + " centimeters");
        }
    }
}
