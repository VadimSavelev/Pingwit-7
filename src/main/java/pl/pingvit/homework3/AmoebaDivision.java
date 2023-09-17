package pl.pingvit.homework3;

public class AmoebaDivision {
// эта пустая строка не нужна, удали плиз

    public static final int NUMBER_OF_CELLS_AFTER_DIVISION_OF_ONE_AMOEBA = 2;
    public static final int QUANTITY_OF_AMOEBAS_AT_THE_BEGINNING = 1;

    public static void main(String[] args) {
        int allQuantityOfAmoebasInAPeriodOfTime = QUANTITY_OF_AMOEBAS_AT_THE_BEGINNING;
        for (int hours = 3; hours <= 24; hours += 3) {
// эта пустая строка не нужна, удали плиз
            allQuantityOfAmoebasInAPeriodOfTime *= NUMBER_OF_CELLS_AFTER_DIVISION_OF_ONE_AMOEBA;
            System.out.println("quantity of amoebas after " + hours + " hours = " + allQuantityOfAmoebasInAPeriodOfTime);
        }
    }
}
