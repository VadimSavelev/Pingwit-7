package pl.pingvit.homework5;
import java.util.Arrays;
//Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]
public class InvertOrder {
    public static void main(String[] args) {
        int[] mas = {0, 1, 2, 3, 4};
        for (int i = 0; i < mas.length / 2; i++) {
            int tmp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(mas));
    }
}
