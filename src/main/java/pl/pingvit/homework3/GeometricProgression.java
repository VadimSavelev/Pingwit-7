package pl.pingvit.homework3;

public class GeometricProgression {

    public static void main(String[] args) {
        int summaGeometricProgression = 0;
        for (int number = 1; number <= 256; number *= 2) {
            summaGeometricProgression += number;
        }
        System.out.println(summaGeometricProgression);
    }
}