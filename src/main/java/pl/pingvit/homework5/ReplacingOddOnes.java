package pl.pingvit.homework5;
import java.util.Arrays;
public class ReplacingOddOnes {
    //    Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
    public static void main(String[] args) {
        int[] mas = {3, 4, 6, 8, 9, 3, 2};
        for (int i = 0; i < mas.length; i++) {
            {
                if (mas[i] % 2 != 0) {
                    mas[i] = 0; // все норм понял
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
