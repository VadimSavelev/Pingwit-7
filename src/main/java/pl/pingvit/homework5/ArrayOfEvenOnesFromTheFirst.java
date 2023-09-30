package pl.pingvit.homework5;
import java.util.Arrays;
//Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
public class ArrayOfEvenOnesFromTheFirst {
    public static void main(String[] args) {
        int[] mas = {2, 3, 5, 7, 8, 4, 2};
        int evenNums = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                evenNums++;
            }
        }
        int[] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                mas2[index] = mas[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}
