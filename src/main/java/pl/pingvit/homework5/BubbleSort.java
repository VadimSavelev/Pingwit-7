package pl.pingvit.homework5;
import java.util.Arrays;
//Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком".
//        Попробуйте сами написать и затем посмотрите реализацию
public class BubbleSort {
    // нужно сделать форматирование кода
    public static void main(String[] args) {
        int[] mas = {1, 2, 4, 6, 7, 4, 3, 2, 1, 6, 7};
        boolean isSorted = false;
        int number;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    number = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = number;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
