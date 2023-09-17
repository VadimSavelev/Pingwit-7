package pl.pingvit.homework3;

public class CalculatorDistance {

    public static final double DISTANCE_ON_THE_FIRST_DAY = 10;
    public static final double PERCENT_AGE_INCREASE_IN_DAILY_VALUE = 10;

    public static void main(String[] args) {
        double summaryDistance = DISTANCE_ON_THE_FIRST_DAY;
        double distanceOnTheNextDay = DISTANCE_ON_THE_FIRST_DAY;
        for (int numberOfTrainingDays = 1; numberOfTrainingDays <= 7; numberOfTrainingDays++) {
            distanceOnTheNextDay += (distanceOnTheNextDay * PERCENT_AGE_INCREASE_IN_DAILY_VALUE) / 100;
            summaryDistance += distanceOnTheNextDay;
// эта пустая строка не нужна, удали плиз
        }
        System.out.println(summaryDistance);
    }
}
