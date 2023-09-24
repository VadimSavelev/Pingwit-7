package pl.pingvit.homework5;
import java.util.Arrays;
//При помощи двумерного массива вывести на экран таблицу умножения
public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] mas = new int[10][10];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = (i + 1) * (j + 1);
                System.out.print((i + 1) + " * " + (j + 1) + " = " + mas[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
